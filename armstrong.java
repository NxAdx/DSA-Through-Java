import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int temp=0, t1=n;
        int sum = 0;
        String str = Integer.toString(n);
        for(int i=0;i<str.length();i++){
             temp = n%10;
             sum = sum + (temp*temp*temp);
             n=n/10;
          }
        if(t1==sum){
              System.out.print("Yes, it is a armstrong number!");
         }
        else{
               System.out.print("No, it is not a armstrong number");
           }
	 sc.close();
        }
    }
