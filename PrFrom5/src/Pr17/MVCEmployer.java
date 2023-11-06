package Pr17;

public class MVCEmployer {
    public static void main(String[] args) {
        Employer model = new Employer();
        EmployerView view = new EmployerView();
        EmployerController controller = new EmployerController(model, view);
        controller.SetName("Иван");
        controller.SetSalary(60000);
        view.GUI(controller);
    }


}
