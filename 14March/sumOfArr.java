import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int arr1[] = new int[n1];    //array1
        for(int i=0;i<n1;i++){
            arr1[i]=scn.nextInt();
        }

        int n2=scn.nextInt();
        int arr2[] = new int[n2];    //array2
        for(int i=0;i<n2;i++){
            arr2[i]=scn.nextInt();
        }
        
        int[] res=sum(arr1,arr2);

        for(int vl:res){
            System.out.println(vl);
        }
    }

    public static int[] sum(int[] arr1,int[] arr2){
        int n1=arr1.length;
        int n2=arr2.length;
        int n3=Math.max(n1,n2);

        int res[]= new int[n3];

        int p1=n1-1, p2=n2-1, p3=n3-1, carry=0;

        while(p1>=0 || p2>=0){
            int v1=p1>=0 ? arr1[p1]:0;
            int v2=p2>=0 ? arr2[p2]:0;
            int sum=v1+v2+carry;

            int dig=sum%10;
            carry=sum/10;
            res[p3]=dig;

            p1--;
            p2--;
            p3--;

        }
        if(carry!=0){
            int newRes[]= new int[n3+1];
            newRes[0]=carry;
             for(int j=1;j<newRes.length;j++){
                 newRes[j]=res[j-1];
             }
             
        }
        return res;
    }
}