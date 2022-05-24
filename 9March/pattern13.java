import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();

        int row=1, nsp=n/2,nst=1,num=1;
        while(row<=n){
            for(int i=1;i<=nsp;i++){
                System.out.print("\t");
            }
            
            int tmp=num;
            for(int i=1;i<=nst;i++){
                System.out.print(tmp+"\t");
                if(i<=nst/2){
                    tmp=tmp+1;
                }else{
                    tmp=tmp-1;
                }
            }
            System.out.println();

            if(row<=n/2){
                nsp=nsp-1;
                nst=nst+2;
                num=num+1;
            }else{
                nsp=nsp+1;
                nst=nst-2;
                num=num-1;
            }
            row++;
        }
    }
}