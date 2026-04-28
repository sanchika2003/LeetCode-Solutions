import java.util.*;
public class Apples {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int M1=sc.nextInt();
        int P1=sc.nextInt();
        int M2=sc.nextInt();
        int P2=sc.nextInt();
        int minCost=Integer.MAX_VALUE;
for(int i=0;i<n/M1;i++){
    int price=i*M1;
    int rem=n-price;
    if (rem%M2==0){
        int fromB=rem/M2;
        int cost=(fromB*P2)+(i*P1);
        if(cost<minCost){
            minCost=cost;
        }
    }
}
System.out.println(minCost);
    }
}
