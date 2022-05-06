import java.util.*;
public class Main{
    public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    int num=scn.nextInt();

    int pos=1;
    int sum=0;
    while(num!=0){
        int dig=num%10;
        int val=pos*(int)Math.pow(10,dig-1);
        sum=+val;
        pos++;
        num=num/10;
    }
    System.out.println(sum);
    }
}