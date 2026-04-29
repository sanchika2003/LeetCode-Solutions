import java.util.*;
class Maxine{
    public static int sockMerchant(int n, int arr[])
    {
         int freq[]=new int[101];
        for(int i=0;i<n;i++)
        {
            freq[arr[i]]++;
        }
        int ans=0;
        for(int i=0;i<=100;i++)
            ans=ans+freq[i]/2;
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int ans=sockMerchant(n,arr);
        System.out.println(ans);
}
}
