package mvc;

public class StudentController {
	private Student model;
	private StudentView view;
	
	public StudentController(Student model, StudentView view){
		this.model = model;
		this.view = view;
	}
	
	public void setStudentName(String name){
		model.setName(name);
	}
	
	public String getStudentName(){
		return model.getName();
	}
	
	public void setStudentID(String sid){
		model.setID(sid);
	}
	
	public String getStudentID(){
		return model.getID();
	}
	
	public void updateView(){
		view.printStudentDetails(model.getName(), model.getID());
	}
}