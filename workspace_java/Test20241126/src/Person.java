
public class Person {
	public String name ;
	public float height;
	public float weight;
	
	
	
	public Person() {
//		name= "김민서";
//		height =177.7F;
//		weight = 80.5F;
	}
	public Person(float height, float weight) {
		this.height=height;
		this.weight=weight;
	}
	public Person(String name) { 
		this.name =name;
	}
	public Person(String name, float height, float weight) {
		this.height=height;
		this.weight=weight;
		this.name=name;
	}
	
	public void prn() {
		System.out.println("이름 : "+ name +", 키 : "+ height +", 몸무게 : " + weight);
	}
}
