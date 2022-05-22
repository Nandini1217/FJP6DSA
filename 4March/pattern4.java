import java.util.*;
public class Main{
    public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();

    for(int i=1;i<=n;i++){
        int nsp=0;
        int nst=n-nsp;

        for(int j=1;j<=nsp;j++){
            System.out.print(" \t");
        }

        for(int k=1;k<=nst;k++){
            System.out.print("*\t");
        }
        System.out.println();
    }
    
    }
}