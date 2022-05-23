import java.util.*;
public class Main{
    public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();

    //initialization
    int row=1, nsp=n/2, nst=1;

    while(row<=n){
        //code for each row
        //print spaces
        for(int i=1;i<=nsp;i++){
            if(row==(n/2) +1){
                System.out.print("*\t");
            }else{
                System.out.print("\t");
            }
        }

        //print stars
        for(int i=1;i<=nst;i++){
            System.out.print("*\t");
        }

        //move to next line
        System.out.println();

        //prepare for next row
         if(row<=n/2){
             nst=nst+1;
         }else{
             nst=nst-1;
         }
         row++;
    }
    }
}