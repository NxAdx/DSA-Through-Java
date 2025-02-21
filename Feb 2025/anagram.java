// https://leetcode.com/problems/valid-anagram/description/

import java.util.Scanner;

class anagram{
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter: ");
        String s = sc.nextLine();
        System.out.println("Enter: ");
        String t = sc.nextLine();
        int[] c1 = new int[26];
        int[] c2 = new int[26];

        for (int i = 0; i < s.length()-1; i++) {
            c1[s.charAt(i) - 'a']++;
            c2[t.charAt(i) - 'a']++;
        }
        System.out.println("String one: ");
        for(int x: c1){
            System.out.print(x+ " ,");
        }
        System.out.println("String two: ");
        for(int y: c2){
            System.out.print(y + " ,");
        }
    }
}