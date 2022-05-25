import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();  //length
        int arr[] = new int[n];    //array
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int ele= scn.nextInt();    //element to find

        int res=find(arr,ele);
        System.out.println(res);
    }

    public static int find(int arr[],int ele){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele){
                return i;
            }
        }
        return -1;
    }
}