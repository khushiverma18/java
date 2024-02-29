class a{
    
    public void name(){
 System.out.println("my name is khushi");
    }
    public void agee(){
        System.out.println("my age is 21");
    }
}
class b extends a{
    public void agee(){
        System.out.println("my age is 20");
    }
}

class methodoverriding{
    public static void main(String[] args) {
        b bc=new b();
        bc.agee();
        bc.name();

    }
}