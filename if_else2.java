import java.util.Scanner;
class if_else2{
    public static void main(String[] args) {
        /*  //given no acording week day
          Scanner sd=new Scanner(System.in);
          System.out.println("enter your value");
         int day=sd.nextInt();
         switch (day) {
            case 1:
                System.out.println("monday");
                break;
                case 2:
                System.out.println("tusday");
                break;
                case 3:
                System.out.println("wednesday");
                break;
                case 4:
                System.out.println("thursday");
                break;
                case 5:
                System.out.println("friday");
                break;
                case 6:
                System.out.println("saturday");
                break;
                case 7:
                System.out.println("sunday");
                break;
            default:
                break;
         }
      */ 

    // check a year enter is leap year or not
   Scanner sr=new Scanner(System.in);
   System.out.println("enter your year");
   int y=sr.nextInt();
   if(y%4==0){
    if(y%100==0){
        System.out.println(y%400==0); 
    }
    else{
        System.out.println("true");
    }}
     else {
        System.out.println("false");
     }
   


}
}