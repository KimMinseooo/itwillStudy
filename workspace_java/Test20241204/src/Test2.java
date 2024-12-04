
import java.io.IOException;

public class Test2 {

	public static void main(String[] args) {
		
		ThrowsException exception = 
				new ThrowsException();
		try {
			exception.loadfile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		exception.loadfile();
		
	}

}