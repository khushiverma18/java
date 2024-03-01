/**
 * Innerdefault_methods
 */
 interface mycamera {
void takesnap();
void takevideo(); 
default void takeboth(){             //default method use in interface when you required a method  and privat also use
    System.out.println("this take both");
}
}

 interface mywifi {
String paswerd();
  void connect();  
}
class myphone{
    void collphone(){
        System.out.println("your phone is ringing......");
    }
    void pickphone(){
        System.out.println("your phone is on......");
    }
}
class phone extends myphone implements mycamera,mywifi{
   public void takesnap(){
        System.out.println("click");
    }
    public void takevideo(){
        System.out.println("on video");
    }
    public String paswerd(){
       return "khufdtf";
    }
    public void connect(){
        System.out.println("your phone is connect");
    }
}


class default_methods{
    public static void main(String[] args) {
      phone mp =new phone();
      mp.connect();
    }
}