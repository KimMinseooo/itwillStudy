package test;

public class Calculator {
//	멤버변수 정수형 memory 
	private int memory;
	
//	메서드() getMemory() 
	public int getMemory() {
		return memory;
	}
//	메서드() setMemory()
	public synchronized void setMemory(int memory) {
		this.memory=memory;
//		쓰레드 2초간 일시 정지
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+":"+this.memory);
	}
	
	
}
