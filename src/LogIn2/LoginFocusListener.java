import java.awt.event.FocusListener;
import java.awt.event.FocusEvent;
import java.awt.Color;
import javax.swing.JTextField;

/** An event listener that listens to focus change events in LogIn frames */
class LoginFocusListener implements FocusListener{
    private LogIn loginFrame;

    public LoginFocusListener(LogIn l){
        this.loginFrame = l;
    }

    /** when gaining focus, we set the backgroud colour 
     * of the text field yellow  */
    public void focusGained(FocusEvent event){
        JTextField tf = (JTextField) event.getSource();
        tf.setBackground(Color.YELLOW);
    }

    /** when losing focus, we reset the backgroud colour */
    public void focusLost(FocusEvent event){
        JTextField tf = (JTextField) event.getSource();
        tf.setBackground(Color.WHITE);
    }
}
