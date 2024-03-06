 import java.text.NumberFormat;
import java.util.*;
 class game{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rc=new Random();
        System.out.println("welacome to stone,paper,scissor game!");
        
         System.out.println("your choice");
         System.out.println("stone");
         System.out.println("paper");
         System.out.println("scissor");
      try{
        System.out.println("enter your 0 for stone,1 for paper or 2 for scissor:");
        int user=sc.nextInt(3);
        int com=rc.nextInt(3);
        if(user==com){
         System.out.println(" its drow..thanks for playing");
        }
         else if(user==0&&com==2||user==1&&com==0||user==2&&com==1){
            System.out.println("you win");
         }
        else{
System.out.println("you lose");
        }
      }
      catch(IndexOutOfBoundsException k){               //nhi hua
         System.out.println("this is not valid..please try again");
      }
 }
}