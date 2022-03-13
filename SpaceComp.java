import java.util.*;

public class SpaceComp{
    public static void main(String[] args) {
        
            try (Scanner sc = new Scanner(System.in)) {
                System.out.print("Enter the value for loop: ");
                int n =sc.nextInt();
                String s = "hi";
                String ar[]=new String[n];
    
                //for o(1)space complexity
                for (int i=0;i<n;i++){
                  System.out.println("Less Gooo");
                }
                
                //for o(n)space complexity
                for(int j=0;j<n;j++){
                    ar[j]=s;
                }
                System.out.println(Arrays.toString(ar));
    }
 }
}