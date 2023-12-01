import java.util.*;
class lcm_q{
    public static void main(String[] args){
        // int n1=72,n2=120,lcm;
        int n1,n2,lcm;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first value");
        n1=sc.nextInt();
        System.out.println("enter the second value ");
        n2=sc.nextInt();
       /*  lcm=(n1>n2)? n1:n2;
        while(true){
            if(lcm % n1 ==0&& lcm%n2==0){
                System.out.println(lcm);
                break;
            }
            ++lcm;
        }
            */
        lcm=n1*n2/6;
        System.out.println(lcm);
    }
}