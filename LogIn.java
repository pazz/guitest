import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusListener;

/**  A Login frame example to illustrate some GUI elements.
 *
 * @author Patrick Totzke
**/
public class LogIn extends JFrame  {

   // we keep these around to access them later to extract their content
   private JTextField textField;
   private JPasswordField passwordField;

   public LogIn()  {
      // turn off the default layout manager
      // to allow absolute positioning
      setLayout(null);
      
      // create an ActionListener to be used multiple times
      LoginButtonListener l = new LoginButtonListener(this);
      
      // create a text field and a label
      JLabel nameLabel = new JLabel("Name:");
      textField = new JTextField(20);
      FocusListener f = new LoginFocusListener(this);
      textField.addActionListener(l);
      textField.addFocusListener(f);
      textField.setToolTipText("Enter your name here!");

      // create a password field and a label
      passwordField = new JPasswordField(20);
      passwordField.setToolTipText("Enter your password here!");
      passwordField.addActionListener(l);
      JLabel passwordLabel = new JLabel("Password:");

      // create a button
      JButton button = new JButton("Log in");
      // associate event handler to the button, to make it handle clicks
      button.addActionListener(l);
      button.setEnabled(true);
      
      // add the components to the frame
      add(nameLabel);
      add(textField);
      add(passwordField);
      add(passwordLabel);
      add(button);

      // position the components and size them
      nameLabel.setBounds(105, 35, 200, 20);
      textField.setBounds(150, 30, 200, 30);
      passwordLabel.setBounds(75, 50, 300, 50);
      passwordField.setBounds(150, 60, 200, 30);
      button.setBounds(175, 110, 120, 30);
   }

   /** getter for the password as String.
    * This looks funny because JPasswordField.getPassword()
    * in fact returns an array of char's and we want to return a String
    */
   public String getPassword(){
       return new String(passwordField.getPassword());
   }

   /** getter for the content of the text field */
   public String getName(){
       return textField.getText();
   }

   public static void main(String[] args)  {
      LogIn frame = new LogIn();
      frame.setTitle("Log in");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocation(new Point (200,170));
      frame.setSize(new Dimension( 500,200));
      frame.setVisible(true);
   }
}
