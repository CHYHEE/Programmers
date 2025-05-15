import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = "";

        for(int i=0; i<n; i++) {
            a += "*";
            System.out.println(a);
        }
    }
}