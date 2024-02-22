class friends{
    public void friend1(){
        System.out.println("my name is khushi");
    }
    public void friend2(){
        System.out.println("my name is simmi");
    }
}
class fri extends friends{
    public void friend3(){
        System.out.println("my name is aayush");
    }
    public void friend2(){
        System.out.println("my name is aniket");
    }
}

class dynamic_method{
    public static void main(String[] args) {
        friends f=new fri(); //allow              / fri f=new friends();  not allow
        f.friend2();
        f.friend1();
       // f.friend3();   is not allow kuki jiska refrence h vo hi print hoga
    }
}