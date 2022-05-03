import java.util.*;
public class Main{
    public static void main(String[] args){
    Scanner scn=new Scanner(System.in);

    //if we have to find prime and non-prime for a range of inputs

    int t=scn.nextInt();  //t specifies the no. of inputs
    for(int i=1;i<=t;i++){
        int num=scn.nextInt();
        int flag=1;
        for(int j=2;j*j<=num;j++){
        if(num%j==0){
        flag=0;
        break;
        }   
    }
    if(flag==1){
        System.out.println("prime");
    }else
    System.out.println("not prime");
    }
    


    }
}