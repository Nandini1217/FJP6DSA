import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();

        int row=1, nsp=n/2,nst=1;
        while(row<=n){
            for(int i=1;i<=nsp;i++){
                System.out.print("\t");
            }

            for(int i=1;i<=nst;i++){
                if(i==1 || i==nst){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();

            if(row<=n/2){
                nsp=nsp-1;
                nst=nst+2;
            }else{
                nsp=nsp+1;
                nst=nst-2;
            }
            row++;
        }
    }
}