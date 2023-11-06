package Pr17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployerView extends JFrame{

    JButton promoteButton = new JButton("Повысить зарплату");
    JButton lowerButton = new JButton("Понизить зарплату");
    JButton displayButton = new JButton("Показать данные");

    public void GUI(EmployerController controller){
        JFrame frame = new JFrame();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - getWidth()) / 2;
        int y = (screenSize.height - getHeight()) / 2;
        frame.setLocation(x-200, y-200);
        frame.setSize(550,100);
        frame.setLayout(new FlowLayout());
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(promoteButton);
        frame.add(lowerButton);
        frame.add(displayButton);

        promoteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.IncreaseSalary();
                ViewData(controller.GetName(), controller.GetPost(), controller.GetSalary());
            }
        });

        lowerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.ReduceSalary();
                ViewData(controller.GetName(), controller.GetPost(), controller.GetSalary());
            }
        });

        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ViewData(controller.GetName(), controller.GetPost(), controller.GetSalary());
            }
        });
        frame.setVisible(true);
    }

    public void ViewData(String name, String post, double salary){
        JOptionPane.showMessageDialog(null, "Employee Name: " + name + "\nPosition: " + post + "\nSalary: " + salary);
    }
}
