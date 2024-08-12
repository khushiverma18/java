public class binomial {
    public static int factorial(int n) {
        int x=1;
        for(int i=1;i<=n;i++){
            x=x*i;
        }
     return x;
    }
    public static int bio(int a, int b) {
       int fac_a=factorial(a);
       int fac_b=factorial(b);
       int fac_c=factorial(a-b);
       return fac_a/fac_b*fac_c;
    }
    public static void main(String[] args) {
       System.out.println(factorial(6)); 
       System.out.println(bio(6, 4));
    }
}
