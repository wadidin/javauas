
//package
package inputgui;

//library
import javax.swing.JOptionPane;

//class
public class modifsoal2 {
    
    //method main
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog("Siapa Nama Kamu ?");
        
        JOptionPane.showMessageDialog(null, nama);
        
        System.exit(0);
    }
    
}
