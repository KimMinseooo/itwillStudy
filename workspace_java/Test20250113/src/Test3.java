import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;

public class Test3 {
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Start Thread");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("end Thread");
			}
		});
		
		thread.start();
		
		Thread thread2 = new Thread(()-> {
			System.out.println("Start Thread2");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("end Thread2");
		});
	
		thread2.start();
		
		
		List<String> list = new ArrayList<String>();
		list.add("요소1");
		list.add("요소2");
		list.add("요소3");
		
		list.forEach(x -> System.out.println(x));
		
		Stream<String> stream  = list.stream();
		stream.forEach(x->System.out.println(x));
		list.stream().sorted().forEach(x->System.out.println(x));
		list.stream()
			.filter(x->x.equals("요소2"))
			.forEach(x->System.out.println(x));
		
		int arr[] = {1,2,3,4,5};
		Arrays.stream(arr).forEach(n->System.out.println(n));
		
		int sum = Arrays.stream(arr).sum();
		
		
	}
}
