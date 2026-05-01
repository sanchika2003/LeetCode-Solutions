import java.util.*;
class Solution
{
    public static void main(String[] args)
    {
           Scanner sc=new Scanner(System.in);
           String str=sc.nextLine();
           int hour,minute;
           hour=(str.charAt(0)-'0')*10 + str.charAt(1)-'0';
           minute=(str.charAt(3)-'0')*10 + str.charAt(4)-'0';
           int res=0;
           while(hour%10 != minute/10 || hour/10!= minute%10)
             {
                      minute++;
                      if(minute==60)
                      {
                          minute=0;
                          hour++;
                      }
                      if(hour==24)
                           hour=0;
                     res++;
             } 
             System.out.println(res);
    }
}