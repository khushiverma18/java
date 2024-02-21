import java.util.Scanner;
class subpersentage{
public static void main(String[] arg){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter total no of all subject:");
    int no=sc.nextInt();
    System.out.println("enter your maths no:");
    float no1=sc.nextFloat();
    System.out.println("enter your english no:");
    float no2=sc.nextFloat();
    System.out.println("enter your hindi no:");
    float no3=sc.nextFloat();
    System.out.println("enter your computer no:");
    float no4=sc.nextFloat();
    System.out.println("enter your c no:");
    float no5=sc.nextFloat();
   float result=no1+no2+no3+no4+no5;
   float result2=result*100/(5*no);
   System.out.println(result2);
}
}