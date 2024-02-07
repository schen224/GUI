import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //1. Create a frame
        JFrame frame = new JFrame();
        frame.setSize(1000, 1000);

//panel
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(new Color(90,90,90));

        ImageIcon icon = new ImageIcon("Images/one.jpeg");
        ImageIcon anotherIcon = new ImageIcon("Images/three.jpeg");
        ImageIcon thirdIcon = new ImageIcon("Images/four.jpeg");
        icon.setImage(icon.getImage().getScaledInstance(500,500,Image.SCALE_DEFAULT));
        anotherIcon.setImage(anotherIcon.getImage().getScaledInstance(500,500,Image.SCALE_DEFAULT));
        thirdIcon.setImage(thirdIcon.getImage().getScaledInstance(500,500,Image.SCALE_DEFAULT));
        JLabel picLabel = new JLabel();

        JTextField textField = new JTextField(10);


        JLabel label = new JLabel("Now showing: ");
        JButton buttonOne = new JButton("<--");

        buttonOne.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e){

                    label.setText("Now showing: Cat");
                    picLabel.setIcon(anotherIcon);
                    panel.add(picLabel, BorderLayout.CENTER);


            }
        });



        buttonOne.setSize(50,50);
        JButton buttonTwo = new JButton("-->");
        buttonTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

              picLabel.setIcon(icon);
                panel.add(picLabel, BorderLayout.CENTER);
                label.setText("Now showing: Album ");

            }
        });

        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String blah = textField.getText();
                picLabel.setIcon(thirdIcon);
                label.setText("Now showing: " + blah);




            }
        });

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