import java.util.Scanner;

public class twoSum{
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        System.out.println("Enter the values: ");
        int nums[] = new int[size];
        int vI =0, vJ=0;
        for(int k=0;k<size;k++) nums[k] = sc.nextInt();
        System.out.println("Enter the target:");
        int target = sc.nextInt();//9
// 11,15, 2,7,
        for(int i=0;i<size;i++){
            vI = nums[i];//0
            for(int j=i+1;j<size;j++){
                vJ = nums[j];//1
                if(target== vI + vJ){
                    System.out.println("value of i = " + i + " value of j = " + j + " sum = "+ (vI + vJ) );
                }
            }
        }
    }
}