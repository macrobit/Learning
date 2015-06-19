package mvc;

public class MVCDemo {
	public static void main(String[] args){
		Student model = retriveStudentFromDatabase();
		StudentView view = new StudentView();
		StudentController controller = new StudentController(model, view);
		
		controller.updateView();
		controller.setStudentName("Figo");
		controller.setStudentID("002");
		controller.updateView();	
	}
	
	private static Student retriveStudentFromDatabase(){
		Student model = new Student("Alice", "001");
		return model;
	}
}
