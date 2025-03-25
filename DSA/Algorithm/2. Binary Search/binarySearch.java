import java.util.Scanner;

public class binarySearch {
    public static int searcH(int ar[], int tg, int len){
        int left =0, right = len -1;
        while(left<=right){
            int mid = left + (right - left) / 2;
            if(ar[mid]==tg){
                return mid;
            }
            if(ar[mid]<tg){
                left = mid + 1;
            }else{
                right = mid -1;
            }
        }
        return -1;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int ar[] = {2,6,7,11,77,100};
        int length = ar.length;
        System.out.println("Enter the target: ");
        int target = sc.nextInt();
        int result = searcH(ar,target,length);
        System.out.println("Result: "+ result);
    }
}
