import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();

         for (int row=1;row<=n;row++){
             for (int col=1;col<=n;col++){
                 //for A 
                 if(row==1){
                     if(col==n || (col>=1 && col<=n/2+1)){
                         System.out.print("*\t");
                     }else{
                         System.out.print("\t");
                     }
                 }
                 //for B 
                 else if(row>1 && row<n/2+1){
                     if(col==n/2+1 || col==n){
                         System.out.print("*\t");
                     }else{
                         System.out.print("\t");
                     }
                 }
                //for C
                else if(row==n/2+1){
                    System.out.print("*\t");
                }
                //for D
                else if(row>n/2+1 && row<n){
                   if(col==n/2+1 || col==1){
                         System.out.print("*\t");
                     }else{
                         System.out.print("\t");
                     } 
                }
                //for E 
                else if(row==n){
                    if(col==1 || (col<=n && col>=n/2+1)){
                        System.out.print("*\t");

                    }else{
                        System.out.print("\t");
                    }
                }
                 
                 
             }
             System.out.println();
         }
    }
}