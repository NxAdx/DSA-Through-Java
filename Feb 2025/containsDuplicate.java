import java.util.Scanner;
import java.util.concurrent.TransferQueue;

class containsDuplicate{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int length = sc.nextInt();
        System.out.print("Enter Values: ");
        int[] vals = new int[length];
        for(int x=0;x<length;x++){
            vals[x] = sc.nextInt();
        }
        int yes = 0;
        outloop:
        for(int i=0;i<length;i++){
            for(int j=i+1; j<length;j++){
                if(vals[i]==vals[j]){
                    yes = 1;
                    break outloop;
                }
            }
        }
        
        if(yes==1){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        
     }
}