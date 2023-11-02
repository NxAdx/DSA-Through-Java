import java.util.Scanner;

public class Fib_Ser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the condition: ");
        int n = sc.nextInt();
        int[] fib = new int[n];
        fib[0]=0;
        fib[1]=1;
        for(int i=2;i<n;i++){
             fib[i] = fib[i-1] + fib[i-2];
          }
       for(int x: fib){
            System.out.print(x + " ");
 
           }
	 sc.close();
        }
    }
