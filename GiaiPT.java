
package giaipt;
import java.util.Scanner;

public class GiaiPT {
    
    public static void main(String[] args) {
    ptb1 so = new ptb1(); 
    ptb1 so1 = new ptb1(); 
    
    Scanner sc = new Scanner(System.in);
    int choose;
    System.out.println("Nhap lua chon: 1 hoac 2");
    choose = Integer.parseInt(sc.nextLine());   
    
    switch(choose){
        case 1:
            // a*x + b = 0 . 
            so.nhap();
            so.kt();
            break;
        case 2:
            // a*x*x + b*x + c = 0
            so1.nhap();
            so1.check();
 
        }
    }
}
