interface class1{
    void m1();                      //interface use in inhertance only when both class is interface
    void m2();
}
interface class2 extends class1{
    void m3();
    void m4();
}
class mains implements class2{
     public void m3(){
        System.out.println("hlo");
    }
    public void m4(){
 System.out.println("hii2");
    }
    public void m1(){
        System.out.println("hlo3");
    }
    public void m2(){
 System.out.println("hii4");
    }
}



class inh_interface{
    public static void main(String[] args) {
        mains m= new mains();
        m.m3();
    }
}