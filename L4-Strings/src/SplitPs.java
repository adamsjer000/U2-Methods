import javax.swing.*;

public class SplitPs {

    /*
    Assuming a String has a P, return a String containing the first p and the next 3 letters.

    "Hippopotamus" -> ppop
     */

    /*
      The Plan
      1. Get the input
      2. Isolate or find the first p
      3. Isolate three letters after p
      4. Output
    */


    public static void main(String[] args) {
        String word = JOptionPane.showInputDialog("Enter a word with a p: ");

        JOptionPane.showMessageDialog(null, splitP(word));
    }

   public static String splitP (String word){

        int pIndex = word.indexOf("p");

        return word.substring(pIndex, pIndex + 4);
   }
}
