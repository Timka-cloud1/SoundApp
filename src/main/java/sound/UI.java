package sound;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI {

   private JFrame frame;
   private JLabel label;

    public static void main(String[] args){
        UI ui = new UI();
        ui.go();



    }
    public void go() {
        frame = new JFrame();

        JButton colorButton = new JButton("Change Color");
        JButton labelButton = new JButton("Change Label");
        colorButton.addActionListener(new ColorListener());
        labelButton.addActionListener(new LabelListener());
        label = new JLabel("I'm a label");
        MyDrawPanel myDrawPanel = new MyDrawPanel();
        frame.getContentPane().add(BorderLayout.CENTER,myDrawPanel);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.WEST, label);
        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);

    }

   class LabelListener implements ActionListener {

       @Override
       public void actionPerformed(ActionEvent e) {
            label.setText("Changed");
       }
   }

   class ColorListener implements ActionListener {

       @Override
       public void actionPerformed(ActionEvent e) {
            frame.repaint();
       }
   }




}
