package APCompSci.HW;

/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * S-h-e-n-e-n-d-e-h-o-w-a--H-i-g-h--S-c-h-o-o-l--T-e-c-h-n-o-l-o-g-y--D-e-p-t
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * FILE: GraphicsRunner.java
 * DATE: Nov 5, 2018
 * AUTHOR: mr Hanley
 * PURPOSE: Create 9 different Images to practice for loops and Graphics
 *
 * ~~~~~~~~~~~~~~m-r-h-a-n-l-e-y.c-o-m~~~~~~~~~~t-e-a-m-2-0-.-c-o-m~~~~~~~~~~~
 */
import java.awt.*;
import javax.swing.*;

public class GraphicsRunner {

    public static void main(String args[]) {
        JFrame jf = new JFrame("Graphics Patterns");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setResizable(false);
        jf.setSize(515, 565);

        @SuppressWarnings("unused")
        Container c = jf.getContentPane();
        JButton nextPix = new JButton("New Picture");

        GraphicsJPanel flp = new GraphicsJPanel(nextPix);
        jf.add(flp);

        jf.add(nextPix, BorderLayout.SOUTH);

        jf.setVisible(true);
    }
}
