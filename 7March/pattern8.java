import java.util.*;
public class Main{
    public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();

    //initialization
    int row=1, nsp=1, nst=(n/2)+1;

    while(row<=n){
        //code for each row
        //1.stars
        for(int i=1;i<=nst;i++){
            System.out.print("*\t");
        }
        //2.spaces
        for(int i=1;i<=nsp;i++){
            System.out.print("\t");
        }
        //3.stars
        for(int i=1;i<=nst;i++){
            System.out.print("*\t");
        }

        //move to new line
        System.out.println();

        //preparation for next row
        if(row<=n/2){  //for first half
            nsp=nsp+2;
            nst=nst-1;
        }else{         //for second half
            nsp=nsp-2;
            nst=nst+1;
        }
        row++;
    }
    }
}