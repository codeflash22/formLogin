
package loginpage;

import javax.swing.JFrame;

public class LoginPage {

    public static void main(String[] args) {
        JFrame frame1 = new JFrame("MIT 16");

        loginGUI logObj = new loginGUI();
        frame1.add(logObj);
        
        frame1.setVisible(true);
        frame1.setSize(800,400);
        
    }
    
}
