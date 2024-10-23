import java.util.Scanner;

public class ArrayCycleyRotate {
       public static int[] Cycle(int arr[],int n,int k)
       {
                 
              if(k>n)
              {
                     k=k%n;

              }
              int ans[]=new int[n];

              for(int i=0;i<k;i++)
              {
                     arr[i]=arr[n-k+i];

              }
              int index=0;

              for(int j=k;j<n;j++)
              {
                     ans[j]=arr[index++];

              }
              return ans;
       }
       public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           int n=5;
           int k=2;
           

          int arr[]={11,22,33,44,55};
           //for(int i=0;i<size;i++){
           //   arr[i]=sc.nextInt();

           //}
           System.out.println(Cycle(arr, n, k));

           for(int i=0;i<n;i++){
              System.out.print(arr[i]+" ");
           }

       }
       
}
