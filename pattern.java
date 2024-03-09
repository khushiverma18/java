/*class pattern{
    public static void pat(int row,int col){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==1||i==row||j==1||j==col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println( );
        }
    }
    public static void main(String arg[]){
        pat(4,4);
    }
}
class pattern{
    public static void pat(int n){
        for(int i=1;i<=n;i++){
            //for(int j=1;j<=(i-1);j++){                for-\\
            for(int j=1;j<=(n-i);j++){                 //for-//
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){

                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pat(7);
    }
}
class pattern{
     public static void pat(int n){
        for(int i=1;i<=n;i++){
           // for(int j=1;j<=(i-n);j++){        //for-\\
          // for(int j=1;j<=(n-i);j++){      foe-//
           // System.out.print(" ");
           
           for(int j=1;j<=i;j++){
            System.out.print("*");
           }
           System.out.println( );}
        } 
    
    public static void main(String[] args) {
        pat(6);
    }
}
class pattern{
    public static void main(String[] args) {
        int count=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println( );
        }
    }
}*/
  

//dimaond pattern
class pattern{
    public static void main(String[] args) {
        for(int i=1;i<=6;i++){
            for(int j=1;j<=(6-i);j++){
                System.out.print(" ");
            }
            for(int j=i;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println( );
        }
        for(int i=6;i>=1;i--){
            for(int j=1;j<=(6-i);j++){
                System.out.print(" ");
            }
            for(int j=i;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}