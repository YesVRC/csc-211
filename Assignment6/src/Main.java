import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static void main(String[] args) {
        String name;
        String id;
        String department;

        Frame frame = new Frame("Employee Information Form");

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        Label employeeName = new Label("Name: ");
        employeeName.setLocation(20, 50);
        employeeName.setSize(50, 20);

        TextField employeeNameInput = new TextField();
        employeeNameInput.setBounds(80, 50, 100, 20);

        Label employeeId = new Label("ID: ");
        employeeId.setLocation(20, 80);
        employeeId.setSize(50, 20);

        TextField employeeIdInput = new TextField();
        employeeIdInput.setBounds(80, 80, 100, 20);

        Label employeeDept = new Label("Dept: ");
        employeeDept.setLocation(20, 110);
        employeeDept.setSize(50, 20);

        TextField employeeDeptInput = new TextField();
        employeeDeptInput.setBounds(80, 110, 100, 20);

        Button submit = new Button("Submit");
        submit.setBounds(80, 140, 100, 50);


        Label output = new Label("- Output - ");
        output.setBounds(80, 200, 200, 50);

        submit.addActionListener((l) -> {
            output.setText(String.format("Name: %s ID: %s Dept: %s", employeeNameInput.getText(), employeeIdInput.getText(), employeeDeptInput.getText()));
        });
        frame.add(employeeName);
        frame.add(employeeNameInput);
        frame.add(employeeId);
        frame.add(employeeIdInput);
        frame.add(employeeDept);
        frame.add(employeeDeptInput);
        frame.add(submit);
        frame.add(output);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}