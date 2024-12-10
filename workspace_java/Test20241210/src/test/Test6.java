package test;

public class Test6 {
	
	public static void main(String[] args) {
//		p322
//		인터페이스 Scheduler
//		추상 메서드 getNextCall() , sendCallToAgent() 
		
//		상속받는 클래스 RoundRobin, LeastJob, PriorityAllocation 
		
		Scheduler scheduler = new RoundRobin();
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
		System.out.println("========================");
		
		scheduler = new LeastJob();
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
		System.out.println("========================");
		
		scheduler = new PriorityAllocation();
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
		
	}
}
