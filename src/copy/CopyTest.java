package copy;

public class CopyTest {
	public static void main(String[] args) {
		Student s1 = new Student("Alice", "Database");
		System.out.printf("Name: %s - Subject: %s \n", s1.getName(), s1.getSubName());
		
		Student clonedStu = (Student)s1.sClone();
		Student clonedStu2 = (Student)s1.dClone();
		System.out.printf("Shadow cloned one  Name: %s - Subject: %s \n", clonedStu.getName(), clonedStu.getSubName());
		System.out.printf("Deep cloned one  Name: %s - Subject: %s \n", clonedStu2.getName(), clonedStu2.getSubName());
		
		s1.setSub("Algebra");
		s1.setName("Bob");
		System.out.printf("Name: %s - Subject: %s \n", s1.getName(), s1.getSubName());
		System.out.printf("Shadow cloned one  Name: %s - Subject: %s \n", clonedStu.getName(), clonedStu.getSubName());
		System.out.printf("Deep cloned one  Name: %s - Subject: %s \n", clonedStu2.getName(), clonedStu2.getSubName());
		
		
	}
}
