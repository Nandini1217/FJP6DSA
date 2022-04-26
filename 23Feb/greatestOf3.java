import java.util.*;
public class Main{
    public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    int a=scn.nextInt();
    int b=scn.nextInt();
    int c=scn.nextInt();
    if(a>b){
        if(a>c){
            System.out.println("a is greatest");
        }else
        System.out.println("c is greatest");
    }else if(b>c){
        System.out.println("b is greatest");
    }else
    System.out.println("c is greatest");
System.out.println(a);
System.out.println(b);
System.out.println(c);

    }
}
