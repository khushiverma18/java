class methodoverlodded{
    static void dog(){
        System.out.println("my dog ");
    }
    static void dog(String name){
       System.out.println("my dog name is "+name);
    }
    public static void main(String[] args) {
        dog();
        dog("tommy");
    }
}