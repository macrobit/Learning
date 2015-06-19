package list;
import java.util.ArrayList;

class Student {
	private String Name;
	private int age;
	public Student(){}
	public Student(String Name, int age) {
	this.Name = Name;
	this.age = age;
	}
	public void printOut() {
		System.out.println(this.Name);
		System.out.println(this.age);
	}
}

public class ArrayListTest {
	
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		String[] names = {"Alice","Bob","Clark","Dick"};
		int[] ages = {18,10,29,30};
		int i = 0;
		while(i < 4) {
			Student s = new Student(names[i],ages[i]);
			al.add(s);
			i++;
		}
		System.out.println(al.get(0)== al.get(0));
		
	}
}

