
//package
package gambardansalam;

//library
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

//class
public class modifsoal1 {
    
    //method main
    public static void main(String[] args) throws Exception {
        URL lokasiGambar = new URL("http://another.maple4ever.net/wp-content/uploads/2007/11/duke.gif");
        JOptionPane.showMessageDialog(null, "Hai Bro, Ngopi yuk...", "Gambarku", JOptionPane.PLAIN_MESSAGE, new ImageIcon(lokasiGambar));
        
        System.exit(0);
    }
    
}

