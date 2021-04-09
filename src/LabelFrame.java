import javax.swing.*;

public class LabelFrame extends JFrame {

   public LabelFrame(String title)  {
      super(title);
      JLabel label = new JLabel("Here is some text.", 
                                SwingConstants.CENTER);
      this.add(label);
   }

   public static void main(String[] args) {
      LabelFrame frame = new LabelFrame("Label Frame");
      frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
      frame.setBounds(0, 0, 250, 150);
      frame.setVisible(true);
   }
}
