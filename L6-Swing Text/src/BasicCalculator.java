import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicCalculator {


    /* Create a calculator program with two text fields
    and 4 buttons, one for each of the arithmetic operations.

    The user will enter numbers, could be decimals, then click
    on one of the buttons and the answer will display on the calculator.

    NO POP-UPS
     */

    public static void main(String[] args) {





        JFrame window = new JFrame("Basic Calculator");
        JPanel panel = new JPanel();
        JLabel textInputLabel = new JLabel("Enter a number: ");
        JLabel textInputLabel2 = new JLabel("Enter a number: ");
        JTextField inputField1 = new JTextField(10);
        JTextField inputField2 = new JTextField(10);

        JButton add = new JButton("add");
        JButton subtraction = new JButton("subtraction");
        JButton multiply = new JButton("multiply");
        JButton divide = new JButton("divide");

        window.setSize(150, 200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        add.addActionListener(new addListener());


        panel.add(inputLabel1);
        panel.add(inputField1);
        panel.add(inputLabel1);
        panel.add(inputField2);

        panel.add(resultLabel);



        panel.add(textInputLabel);
        panel.add(textInputLabel2);
        panel.add(add);
        panel.add(subtraction);
        panel.add(divide);
        panel.add(multiply);

        window.add(panel);
        window.setVisible(true);

    }

    private static class addListener implements ActionListener{

        public void actionPerformed(ActionEvent actionEvent){
            double number1 = Double.parseDouble(inputField.getText());
            double number2 = Double.parseDouble(inputField2.getText());

            resultLabel.setText(String.valueOf(number1 + number2));
        }
    }
}

