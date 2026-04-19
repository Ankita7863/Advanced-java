//*Basic hello program of Swing displaying the message Hello! VI A , 
//*Welcome to Swing Programming in Blue color plain font with font size of 32 using Jframe and Jlabel



package swings1;


import java.awt.*;
import javax.swing.*;

public class SwingExample {

    SwingExample() {

        // Create frame
        JFrame jfrm = new JFrame("A Simple Swing Application");

        // Set size and layout
        jfrm.setSize(500, 200);
        jfrm.setLayout(new FlowLayout()); // ✅ Important for proper display

        // Close operation
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create label
        JLabel jlab = new JLabel("Hello! VI A, Welcome to Swing Programming!");

        // Set font and color
        jlab.setFont(new Font("Verdana", Font.PLAIN, 18));
        jlab.setForeground(Color.BLUE);

        // Add label to frame
        jfrm.add(jlab);

        // Center the frame on screen
        jfrm.setLocationRelativeTo(null);

        // Make visible
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {

        // Run in Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingExample();
            }
        });
    }
}
