/** A simple example to illustrate the JFrame class. */
import javax.swing.JFrame;

public class EmptyGUI {

   public static void main (String[] args) {

      JFrame frame = new JFrame("My JFrame");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setBounds(0, 0, 500, 200);
      frame.setVisible(true);
   }
}
