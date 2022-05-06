import java.util.*;
public class Main{
    public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    
    int n1=scn.nextInt();
    int n2=scn.nextInt();
    while(n1%n2!=0){
        int rem=n1%n2;
        n1=n2;
        n2=rem;
    }
    int hcf=n2;
    int lcm=(n1*n2)/hcf;
    System.out.println("hcf is "+hcf);
    System.out.println("lcm is "+lcm);
    }
}
