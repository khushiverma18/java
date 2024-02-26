abstract class phone{
    public void ring(){
  System.out.println("riii riii riii....");
    }
    public void camera(){
        System.out.println("click photo");
    }
     abstract void color();    //empty body        morethan one class is is absreact 
     
}
class smartphone extends phone{
    public  void color(){
        System.out.println("my phone color is pink");
    }
}
class smartphone2 extends phone{
    public  void color(){
        System.out.println("my phone color is black");
    }
}

class abstracts{
    public static void main(String[] args) {
        smartphone sp=new smartphone();
        smartphone2 s=new smartphone2();
        s.color();
        sp.color();
        
    }
}