package Pr17;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retriveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.UpdateView();
        controller.setStudentName("Semen");
        controller.UpdateView();
    }

    private static Student retriveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Ivan");
        student.setRollNo("Yes");
        return student;
    }
}
