
import java.util.Scanner;
public class L13C2 {
    int n1,n2,result;
    Scanner sc = new Scanner(System.in);
    void calculate(){
        try {
        System.out.println("Enter first number");
        n1=sc.nextInt();
        System.out.println("Enter second number");
        n2=sc.nextInt();
        result=n1/n2;
        }
        catch(Exception e){
            System.out.println("Ouch! Exception Detected!");
        }
        System.out.println("The division is"+result);
    }
    public static void main(String[] args){
        L13C2 obj = new L13C2();
        obj.calculate();
    }
}
