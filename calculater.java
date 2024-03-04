import java.util.Scanner;
class calculater{
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter your first number");
int num1=sc.nextInt();
System.out.println("enter your secand number");
int num2=sc.nextInt();
System.out.println("enter your opreater (+,*,/,-)");
char operator=sc.next().charAt(0);
int result;
switch(operator){
case '+':
result= num1+num2;
break;
case '*':
result= num1*num2;
break;
case'-':
result= num1-num2;
break;
case '/':
result= num1/num2;
System.out.println(result);

}
}
        }
    

