//to find the digits of the number

import java.util.*;
public class Main{
    public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    int num=scn.nextInt();
    
    int copyOfN= num;
    int tmp=1;
    while(copyOfN>9){
        copyOfN=copyOfN/10;
        tmp=tmp*10;
    }

    while(tmp!=0){
        int dig=num/tmp;
        System.out.println(dig);
        num=num%tmp;
        tmp=tmp/10;
    }
    }
}