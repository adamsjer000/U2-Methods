import javax.swing.*;

public class BankAccount<balance, withdrawal> {

    //create a program which simulates a bank account

    public static void main(String[] args){


    deposit();

    withdrawal();
}
    /*write a method to simulate a deposit.
    Prompt the user to enter their balance and the deposit amount,
    then display the new balance. */

    public static void deposit(){

        double balance =  Double.parseDouble(JOptionPane.showInputDialog("What is your current balance ?")
        double deposit = Double.parseDouble(JOptionPane.showInputDialog("What is your deposit ?");

        balance += deposit;

        JOptionPane.showMessageDialog(null, "Your new balance is:" + balance);
    }

    /*write a method to simulate a withdrawal.
    Prompt the user to enter their balance the withdrawal amount,
    then display the new balance.
     */
public static void withdrawal(){

}
    double balance = Double.parseDouble(JOptionPane.showInputDialog("What is your current balance ?"));
    double withdrawal = Double.parseDouble(JOptionPane.showInputDialog("What is your withdrawal amount ?"));

    balance -= withdrawal;
}