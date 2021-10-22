import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorSwitchGUI {

    //Declare your frame, panel and three buttons.
    JFrame window = new JFrame("Color Switcheroo");
    JPanel panel = new JPanel();
    JButton buttonThemeDark = new JButton("Theme: Dark");
    JButton buttonThemeWarren = new JButton("Theme: Warren");
    JButton buttonThemePrimary = new JButton("Theme: Primary");

    public ColorSwitchGUI() {
        //create your GUI
        buttonThemeDark.addActionListener(new ThemeDark());
        buttonThemeWarren.addActionListener(new ThemeWarren());
        buttonThemePrimary.addActionListener(new ThemePrimary());

        window.setSize(400, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);


        panel.add(buttonThemeDark);
        panel.add(buttonThemeWarren);
        panel.add(buttonThemePrimary);

        window.add(panel);
        window.setVisible(true);

    }

    //add listeners to change the colors. Don't forget to link them to buttons.
    private class ThemeDark implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            Color panelBack = new Color(38, 28, 44);
            Color buttonBack = new Color(62, 44, 65);
            Color buttonText = new Color(110, 133, 178);

            panel.setBackground(panelBack);
            buttonThemeDark.setBackground(buttonBack);
            buttonThemeDark.setBackground(buttonText);
            buttonThemeWarren.setBackground(buttonText);
            buttonThemeWarren.setBackground(buttonText);
            buttonThemePrimary.setBackground(buttonText);
            buttonThemePrimary.setBackground(buttonText);
        }
    }


    private class ThemeWarren implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            Color panelBack = new Color(26, 28, 32);
            Color buttonBack = new Color(207, 117, 0);
            Color buttonText = new Color(244, 244, 244);

            panel.setBackground(panelBack);
            buttonThemeDark.setBackground(buttonBack);
            buttonThemeDark.setBackground(buttonText);
            buttonThemeWarren.setBackground(buttonText);
            buttonThemeWarren.setBackground(buttonText);
            buttonThemePrimary.setBackground(buttonText);
            buttonThemePrimary.setBackground(buttonText);
        }
    }

    private class ThemePrimary implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            Color panelBack = Color.RED;
            Color buttonBack = Color.BLUE;
            Color buttonText = Color.GREEN;

            panel.setBackground(panelBack);
            buttonThemeDark.setBackground(buttonBack);
            buttonThemeDark.setBackground(buttonText);
            buttonThemeWarren.setBackground(buttonText);
            buttonThemeWarren.setBackground(buttonText);
            buttonThemePrimary.setBackground(buttonText);
            buttonThemePrimary.setBackground(buttonText);
        }
    }
}