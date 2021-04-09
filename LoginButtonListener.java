import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class LoginButtonListener implements ActionListener{
    private LogIn loginFrame;

    public LoginButtonListener(LogIn l){
        this.loginFrame = l;
    }
    public void actionPerformed(ActionEvent event){
        String name = loginFrame.getName();
        String passwd = loginFrame.getPassword();

        System.out.println(name + ":" + passwd);
        //System.out.println(event);
        loginFrame.dispose();
    }
}
