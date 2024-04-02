//permutation and combination

import java.util.*;
public class Main{
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    
    public static void permutation(int n, int r){
        int p = fact(n)/fact(n-r);
        System.out.println(p);
    }
    public static void combination(int n, int r){
        int c = fact(n)/fact(n-r)*fact(r);
        System.out.println(c);
    }
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        permutation(n,r);
        combination(n,r);
    }
}
