import java.util.*;
public class Main{
    public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    int num=scn.nextInt();
    int i=0;
    while(num!=0){
        num=num/10;
        i++;
    }
    System.out.println(i);
    }
}