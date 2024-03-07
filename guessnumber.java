import java.util.Random;
import java.util.Scanner;

class game{
    public int num;
    public int numofguess;
    public int inputNumber;
    public int getno(){
        return numofguess;
    }
    public void setno(int numm){
        numofguess=num;
    }
    public game(){
      Random ra=new Random();
      this.num=ra.nextInt(100);    
    }
    void takeuserinput(){
        System.out.println("guess the number");
        Scanner sc=new Scanner(System.in);
        inputNumber=sc.nextInt();
    }
   boolean iscorrectnum(int n){
 if (n==num){
  return true;
 }
 else if(n<num){
    System.out.println("too low.......");
 }
 else if(n>num){
    System.out.println("too high.......");
 }
 else{
    return false;
 }
   }
}


class gussnumber{
    public static void main(String[] args) {
       game g= new game();
       g.takeuserinput(); 
    }
}