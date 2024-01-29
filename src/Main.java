import javax.swing.*;
import java.awt.*;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //1. Create a frame
        JFrame frame = new JFrame();
        frame.setSize(500, 500);

//panel
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(new Color(90,90,90));

//components
        JLabel label = new JLabel("Now playing: ");
        JButton buttonOne = new JButton("<--");
        buttonOne.setSize(50,50);
        JButton buttonTwo = new JButton("-->");
        ImageIcon icon = new ImageIcon("Images/one.jpeg");
        icon.setImage(icon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));
        JLabel picLabel = new JLabel(icon);
        JTextField textField = new JTextField(10);
        //components to panel
        panel.add(label, BorderLayout.NORTH);
                panel.add(buttonOne, BorderLayout.WEST);
                panel.add(buttonTwo, BorderLayout.EAST);
                panel.add(picLabel, BorderLayout.CENTER);
                panel.add(textField, BorderLayout.SOUTH);

                        //Add the panel to frame
        frame.add(panel);
        frame.setVisible(true);





    }
}