package Art;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class DrawHuman extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the face
        g.drawOval(50, 50, 180, 200);  // Head

        // Draw the eyes
        g.drawOval(90, 100, 30, 30);  // Left Eye
        g.drawOval(180, 100, 30, 30); // Right Eye

        // Draw the pupils
        g.fillOval(100, 110, 10, 10); // Left Pupil
        g.fillOval(190, 110, 10, 10); // Right Pupil

        // Draw the nose
        g.drawOval(135, 140, 30, 30); // Nose

        // Draw the mouth
        g.drawArc(110, 160, 80, 50, 0, -180);  // Smile
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        DrawHuman face = new DrawHuman();

        frame.add(face);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
