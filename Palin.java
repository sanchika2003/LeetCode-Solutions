/*
LeetCode Problem: 9. Palindrome Number
*/
class Palindrome{
    public boolean isPalin(int n){
        int rev=0;
        int ori=n;
      while(n>0){
         int d=n%10;
         rev=rev*10+d;
         n=n/10;
      }
      if(rev==ori){
        return true;
      }
      else{
        return false;
      }
    }
}