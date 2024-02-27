
   interface bike{
    int a=7;
    void speedup(int s);
    void breaks(int b);
}
class moterbike  implements bike{
   int speed=66;
    public void speedup(int s){
        System.out.println(speed+s);
    }
    public void breaks(int b){
        System.out.println(speed-b);
    }
}

class interfaces{
    public static void main(String[] args) {
       moterbike mb=new moterbike();      //c't create interface class object but create refrence
       mb.speedup(4);
       mb.breaks(3); 
       System.out.println(mb.a); //you can create property in interface
    }
}