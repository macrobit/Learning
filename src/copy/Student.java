package copy;


public class Student implements Cloneable {
	private String name;
	private Subject sub;
	
	public Student(String name, String subject) {
		this.name = name;
		sub = new Subject(subject);
	}
	
	public void setName (String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSub(String subject) {
		sub.setName(subject);
	}
	
	public Subject getSub() {
		return sub;
	}
	
	public String getSubName() {
		return sub.getName();
	}
	
	public Object sClone() {
		//shadow copy
		try {
			return super.clone();
		} catch	(CloneNotSupportedException e) {
			return null;
		}	
	}
	
	public Object dClone() {
		//deep copy
		Student stu = new Student(name, sub.getName());
		return stu;
	}	
}
