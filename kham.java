import java.util.Scanner;
 public class kham{
    public static void main(String[] arg){
        System.out.println("hi");
        char operator;
        Double num1,num2,result;
        Scanner input =new Scanner(System.in);
        System.out.println("enter the operator");
        operator =input.next().charAt(0);
        System.out.println("enter the first value");
        num1=input.nextDouble();
        System.out.println("enter the 2value");
        num2=input.nextDouble();
        switch(operator){
            case'+':
            result=num1+num2;
            System.out.println(result);
            break;
    
            case'-':
            result=num1-num2;
            System.out.println(result);
            break;

            case'*':
            result=num1*num2;
            System.out.println(result);
            break;

            case'/':
            result=num1/num2;
            System.out.println(result);
            break;

            default:
            System.out.println("invalide op");
            break;
        
        }
                
    }
}