package DSA;
import java.util.Scanner;

public class linearSearch {
    public static int searcH(int ar[], int tg, int len){
        for(int i=0;i<len;i++){
            if(ar[i]==tg){
                return i;
            }
        }
        return -1;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int length = sc.nextInt();
        int ar[] = new int[length];
        System.out.println("Enter the values: ");
        for(int i=0;i<length;i++){
            ar[i] = sc.nextInt();
        }
        System.out.println("Enter the target: ");
        int target = sc.nextInt();
        int result = searcH(ar,target,length);
        System.out.println("Result: "+ result);
    }
}
