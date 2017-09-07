
//package
package gambardansalam;

//library
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

//class
public class soal1 {
    
    //method main
    public static void main(String[] args) throws Exception {
        URL lokasiGambar = new URL("https://scontent-sin6-2.xx.fbcdn.net/v/t1.0-9/10407562_1144241665602927_4923990988257599296_n.jpg?oh=8934f8b40d0c78595d34cbde94672228&oe=5A1A2A86");
        JOptionPane.showMessageDialog(null, "Hai.....", "Gambarku", JOptionPane.PLAIN_MESSAGE, new ImageIcon(lokasiGambar));
        
        System.exit(0);
    }
    
}

