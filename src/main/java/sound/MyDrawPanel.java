package sound;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel {
    public void paintComponent(Graphics g) {
//        g.setColor(Color.ORANGE);
//        g.fillRect(20,50,100,100);

//        Image image = new ImageIcon("download.jpeg").getImage();
//        g.drawImage(image, 3,4,this);

//        g.fillRect(0,0,this.getWidth(), this.getHeight());
//        int red = (int) (Math.random() * 255);
//        int green= (int) (Math.random() * 255);
//        int blue = (int) (Math.random() * 255);
//        Color randomColor = new Color(red,green,blue);
//        g.setColor(randomColor);
//        g.fillOval(70,70,100,100);
        Graphics2D g2d = (Graphics2D) g;
        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        Color startColor = new Color(red, green, blue);

         red = (int) (Math.random() * 255);
         green = (int) (Math.random() * 255);
         blue = (int) (Math.random() * 255);
        Color endColor = new Color(red, green, blue);
        GradientPaint gradient = new GradientPaint(130,130,startColor, 100, 100, endColor);
        g2d.setPaint(gradient);
        g2d.fillOval(70,70,100,100);
    }
}
