
public class Subject {
	String subjectName;
	int subjectScore;
	
	public Subject() {
	}

	public Subject(String subjectName, int subjectScore) {
		this.subjectName = subjectName;
		this.subjectScore = subjectScore;
	}



	public void subjectPrn() {
		System.out.println(subjectName +" : " +subjectScore);
	}
}
