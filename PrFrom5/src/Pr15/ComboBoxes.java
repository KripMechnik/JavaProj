package Pr15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxes extends JFrame {


    JTextArea jta = new JTextArea(10, 60);


    ComboBoxes(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - getWidth()) / 2;
        int y = (screenSize.height - getHeight()) / 2;
        setLocation(x-200, y-200);
        setSize(400,300);
        setLayout(new BorderLayout());

        JPanel northPanel = new JPanel();
        northPanel.setLayout(new FlowLayout());
        getContentPane().add(BorderLayout.NORTH, northPanel);

        JComboBox<String> colorBox = new JComboBox<>(new String[]{"Красный", "Черный", "Синий"});
        colorBox.setEditable(true);
        colorBox.setSelectedItem("Выберите опцию");
        colorBox.setEditable(false);
        northPanel.add(colorBox, BorderLayout.NORTH);

        JComboBox<String> infoBox = new JComboBox<>(new String[]{"Australia", "China", "England" ,"Russia"});
        infoBox.setEditable(true);
        infoBox.setSelectedItem("Выберите Страну");
        infoBox.setEditable(false);
        northPanel.add(infoBox, BorderLayout.NORTH);

        jta.setLineWrap(true);
        jta.setWrapStyleWord(true);
        jta.setEditable(false);

        getContentPane().add(BorderLayout.CENTER, jta);
        JScrollPane jsp = new JScrollPane(jta);
        add(jsp);

        colorBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox<String> source = (JComboBox<String>) e.getSource();
                String selectedOption = (String) source.getSelectedItem();
                if (selectedOption == "Красный"){
                    jta.setForeground(Color.RED);
                } else if (selectedOption == "Черный"){
                    jta.setForeground(Color.BLACK);
                } else if (selectedOption == "Синий"){
                    jta.setForeground(Color.BLUE);
                }
            }
        });

        infoBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox<String> source = (JComboBox<String>) e.getSource();
                String selectedOption = (String) source.getSelectedItem();
                if (selectedOption == "Australia"){
                    jta.setText("Text about Australia");
                } else if(selectedOption == "China"){
                    jta.setText("Text about China");
                } else if(selectedOption == "England"){
                    jta.setText("Text about England");
                } else if(selectedOption == "Russia"){
                    jta.setText("Text about Russia");
                }

            }
        });

        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ComboBoxes();
    }
}
