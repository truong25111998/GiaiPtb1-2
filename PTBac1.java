
package giaipt;
import java.util.Scanner;

 class ptb1{
     int a, b, c, delta;
     double d, x1, x2;
        void nhap(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap he so a: ");
        a = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap he so b: ");
        b = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap hang so c: ");
        c = Integer.parseInt(sc.nextLine());
    } 
   
    void kt(){
            if(a == 0){
            if(b == 0)
                System.out.println("pt vo so nghiem");
            else
                System.out.println("pt vo nghiem");
        }
        else       
            System.out.println("Nghiem cua pt la: " + (c-b)/a);
    }
    void check(){
        
        delta = b*b-4*a*c;
        d = Math.sqrt(delta);
        x1 = (-b+d)/2*a;
        x2 = (b-d)/2*a;
        if(a == 0){
        if(b == 0){
        if(c == 0)
                System.out.println("pt vo so nghiem");
        else
                System.out.println("pt vo nghiem");
        }
        else
                System.out.println("nghiem cua pt la: " + (-c/b));
        }
        else{
            System.out.println("nghiem thu 1 pt la: " + x1);
            System.out.println("nghiem thu 2 pt la: " + x2);
            }
    }
}
