
package diabetesprediction;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
//import javax.swing.UnsupportedLookAndFeelException;


public class Main {
    public static void main(String[] args) 
    {                
        try
        {                    
            UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
            
            MainFrame mf=new MainFrame();
            mf.setTitle("Diabetes Prediction System");
            mf.setVisible(true);
            mf.setResizable(false);
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex)
        {
            
        }        
    }
}
