import java.util.Scanner;

public class Fib_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the condition: ");
        int n = sc.nextInt();
        int fibnum=0 , f1=0, f2=1;
        for(int i=2;i<n;i++){
             fibnum = f1 + f2;
             f1 = f2;
             f2 = fibnum; 
          }
         System.out.print(fibnum);
	 sc.close();
        }
    }
