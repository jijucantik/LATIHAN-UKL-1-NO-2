
import java.util.Scanner;


public class LATUKL12 {


public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int bilangan1;

    
        
        System.out.print("Masukkan Bilangan : ");
        bilangan1 = masukan.nextInt();
        
        if(bilangan1 % 2 == 0) {
            System.out.println("Bilangan Genap");
            System.out.println("Bilangan ini bisa dibagi 2");
        } else {
            System.out.println("Bilangan Ganjil");
            System.out.println("Bilangan ini tidak bisa dibagi 2");
            System.out.println("Karena hasil bagi = sisa 1");
        }
        
        masukan.close();
    }
}
