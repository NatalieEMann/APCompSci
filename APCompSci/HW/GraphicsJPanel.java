package APCompSci.HW;

/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * S-h-e-n-e-n-d-e-h-o-w-a--H-i-g-h--S-c-h-o-o-l--T-e-c-h-n-o-l-o-g-y--D-e-p-t
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * FILE: GraphicsJPanel.java
 * DATE: Nov 5, 2019
 * AUTHOR: Someone from internet, I stole it!!!!!
 * VERSION: 1.0
 * PURPOSE: Displays Graphical Patterns
 *
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *
 * m-r-h-a-n-l-e-y-c-.c-o-m~~~~~~~~~~t-e-a-m-2-0-.-c-o-m~~~~~~~~~~~~~~~~~~~~~~
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GraphicsJPanel extends JPanel implements ActionListener {

    private int counter; //# of Clicks
    private int pixNum; //which picture to display

    public GraphicsJPanel(JButton button) {
        counter = 0;
        pixNum = 0;
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        counter++;
        pixNum = counter % 9;
        repaint();

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        switch (pixNum) {
            case 0 ->
                redPyramid(g);
            case 1 ->
                gradientLines(g);
            case 2 ->
                lineArt(g);
            case 3 ->
                circles(g);
            case 4 ->
                diagonal(g);
            case 5 ->
                sinusoidal(g);
            case 6 ->
                clock(g);
            case 7 ->
                circleArt(g);
            case 8 ->
                spirograph(g);
        }
    }

    public void redPyramid(Graphics g) {
        int x = 0; //the red color
        for (int i = 0; i < 10; i++) {
            g.setColor(new Color(x + (28 * i), 0, 0));
            g.fillRect(i + (25 * i), i + (25 * i), 500 - (50 * i), 500 - (50 * i));
        }
    }

    public void gradientLines(Graphics g) {
        for (int i = 0; i < 500; i++) {
            if (i < 250) {
                g.setColor(new Color(0, 0, i));
            } else {
                g.setColor(new Color(0, 0, 500 - i));
            }
            g.drawLine(i, 0, 500 - i, 500);
        }
    }

    public void lineArt(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(0, 0, 500, 500);
        g.setColor(Color.magenta);
        for (int i = 0; i < 11; i++) {
            g.drawLine(0 + i * 25, 0 + i * 25, 250 - i * 25, 250 + i * 25);
        }
        for (int i = 0; i < 11; i++) {
            g.drawLine(500 - i * 25, 0 + i * 25, 250 + i * 25, 250 + i * 25);
        }
        g.setColor(Color.yellow);
        for (int i = 0; i < 11; i++) {
            g.drawLine(0 + i * 25, 250 + i * 25, 250 + i * 25, 500 - i * 25);
        }
        for (int i = 0; i < 11; i++) {
            g.drawLine(0 + i * 25, 250 - i * 25, 250 + i * 25, 0 + i * 25);
        }

    }

    public void circles(Graphics g) {
        int x = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                g.setColor(Color.BLUE);
            } else {
                g.setColor(Color.RED);
            }
            g.fillOval((x * 45), (x * 45), 100, 100);
            x++;
        }
    }

    public void diagonal(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillRect(50, 50, 400, 400);
        int x = 50;
        for (int i = 0; i < 9; i++) {
            g.setColor(Color.red);
            g.drawLine(x + (i * 50), x, x, x + (i * 50));
            for (int j = 0; j < 8; j++) {
                g.setColor(Color.red);
                g.drawLine(450, x + (j * 50), x + (j * 50), 450);
            }
        }
    }

    public void sinusoidal(Graphics g) {
        for (int i = 0; i < 50; i++) {
            g.fillOval(i * 10, -(int) (Math.sin(Math.toRadians(i * 15)) * 100) + 250, 5, 5);
        }
    }

    public void clock(Graphics g) {
        int num = 12;
        double rad = 150;
        double angle = 270;

        for (int i = 0; i < 60; i++) {
            int x = (int) (250 + rad * Math.cos(Math.toRadians(angle)));
            int y = (int) (250 + rad * Math.sin(Math.toRadians(angle)));

            angle = angle + 6;
            if (i % 5 == 0) {
                // string
                g.setFont(new Font("Rockwell", Font.BOLD, 12));
                if (num > 9) {
                    x -= 7;
                } else {
                    x -= 2;
                }
                y += 7;
                g.drawString(num + "", x, y);
                num++;
                if (num == 13) {
                    num = 1;
                }
            } else {
                // draw the circle
                g.drawOval((int) x, (int) y, 5, 5);
            }
        }
    }

    public void circleArt(Graphics g) {
        double rad = 150;
        double angle = 270;
        for (int i = 0; i < 60; i++) {
            int x = (int) (200 + rad * Math.cos(Math.toRadians(angle)));
            int y = (int) (200 + rad * Math.sin(Math.toRadians(angle)));
            angle = angle + 10;
            g.drawOval((int) x, (int) y, 100, 100);
        }
    }

    public void spirograph(Graphics g) {
        double rad = 150;
        double angle = 1;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                g.setColor(Color.red);
                int x = (int) (175 + rad * Math.cos(Math.toRadians(angle)));
                int y = (int) (175 + rad * Math.sin(Math.toRadians(angle)));
                angle = angle + 10;
                g.drawOval((int) x, (int) y, 150, 150);
            } else {
                g.setColor(Color.blue);
                int x = (int) (170 + rad * Math.cos(Math.toRadians(angle)));
                int y = (int) (170 + rad * Math.sin(Math.toRadians(angle)));
                angle = angle + 15;
                g.drawOval((int) x, (int) y, 160, 160);

            }
        }
    }
}
