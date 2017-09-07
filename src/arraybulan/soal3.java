
//package
package arraybulan;

//library
import java.util.Scanner;

//class
public class soal3 {
    
    //method main
    public static void main(String[] args) {
        
        //tipe data dan variabel
        int hari, bulan, tahun;
        
        System.out.print("Bulan berapa yang kamu mau : ");
        Scanner input = new Scanner(System.in);
        
        bulan = input.nextInt();
        System.out.print("Tahun berapa yang kamu mau : ");
        
        tahun = input.nextInt();
        
        switch (bulan){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                
                System.out.println("Berarti jumlah hari dalam bulan " + bulan + "" + " dan tahun " + tahun + " adalah 31");
                break;
            
            case 4:
            case 6:
            case 9:
            case 11:
                
                System.out.println("Berarti jumlah hari dalam bulan "+ bulan + "" + " dan tahun " + tahun + " adalah 30 ");
                break;
            
            case 2:
                
                if ((tahun % 4 == 0) && !(tahun % 100 == 0))
                    System.out.println("Berarti jumlah hari dalam bulan " + bulan + " adalah 29 ");
                else
                    System.out.println("Berarti jumlah hari dalam bulan " + bulan + " dan tahun " + tahun + " adalah 28 ");
                break;
                
            default:
                
                System.out.println("Kamu memasukkan bulan yang salah !");
                break;
        }
    }
}
