class parent{
    public void mth(){
        System.out.println(" i am method");
    }
   public parent(){
 System.out.println("i am parent constructor");
    }
    public parent(int a){
        System.out.println("i am overloddedconstructor"+a);
    }
}
class child1 extends parent{
  public child1(){
    System.out.println("i am child1 construtor");
  }
  public child1(int a,int b){
    super(a);
    System.out.println("i am child1 overloddedconstrutor"+b);
  }
}
class child2 extends child1{
    public child2(){
      System.out.println("i am child2 construtor");
    }
    public child2(int a,int b,int c){
        super(a,b);
      System.out.println("i am child2 overloddedconstrutor"+c);
    }
  }

class inh_constructor{
    public static void main(String[] args) {
       parent p=new parent(); 
       p.mth();
       child2 c=new child2(4,6,8);
    }
}