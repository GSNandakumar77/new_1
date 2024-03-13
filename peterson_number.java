package javabeginner;
import java.util.Scanner;
class Peterson_num {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int fact=1,sum=0;
       int num=n;
       while(n>0){
       int r= n%10;
       for(int i=1;i<=r;i++){
           fact=fact*i;
       }
       sum=sum+fact;
       n=n/10;
       fact=1;
    }
       if(sum==num){
           System.out.println(" number is peterson"  + num);
       }
       else{
           System.out.println("number is not peterson"  +num);
       }
    
}
}