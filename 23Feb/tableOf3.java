import java.util.*;
public class Main{
    public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    int num=scn.nextInt();
    for(int i=1;i<=10;i++){
        int res=num*i;
        System.out.println(num+"*"+i+"="+res);
    }


    }
}