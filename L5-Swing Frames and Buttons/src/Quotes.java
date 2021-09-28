import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Quotes {

    /*Create a GUI program with three buttons.
    Each button displays one of your favorite quotes.
    Hint: Use \n to make a new line.
     */
   public static void main(String[] args){
       JFrame window = new JFrame("Quotes");
       JPanel panel = new JPanel();
       JButton quote1But = new JButton("Click for first quote");
       JButton quote2But = new JButton("Click for second quote");
       JButton quote3But = new JButton("Click for third quote");

       window.setSize(400, 150);
       window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       window.setLocationRelativeTo(null);

       quote1But.addActionListener(new QuoteBut1());
       quote2But.addActionListener(new QuoteBut2());
       quote3But.addActionListener(new QuoteBut3());

       panel.add(quote1But);
       panel.add(quote2But);
       panel.add(quote3But);

       window.add(panel);
       window.setVisible(true);
   }
   private static class QuoteBut1 implements ActionListener {
       public void actionPerformed (ActionEvent e){
           JOptionPane.showMessageDialog(null, "\" This is my favorite quote\"\n-Me");

       }
   }
   private static class QuoteBut2 implements ActionListener {
          public void actionPerformed (ActionEvent e){
              JOptionPane.showMessageDialog(null, "\" This is also my favorite quote\"\n-Me");

   }
}
    private static class QuoteBut3 implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            JOptionPane.showMessageDialog(null, "\" This isn't my favorite quote\"\n-Me");
        }
   }
}