/*class school{
    private String name;
    private int age;
    public String getdata(){
       return name;
    }
    public void setdata(String n){
        name=n;
     }
     public int getid(){
        return age;
     }
     public void setid(int i){
         age=i;
      }
}

class privat{
    public static void main(String[] args) {
        school s=new school();
        s.setdata("khushi");
        System.out.println(s.getdata());
        s.setid(20);
        System.out.println(s.getid());
    }
}
*/

//
class cylinder{
    private int radius;
    private int height;
    public int getr(){
        return radius;
    }
    public void setr(int radius){
        this.radius=radius;
    }
    public int geth(){
        return height;
    }
    public void seth(int h){
         height=h;
    }
    public double volume(){
        return 3.14*height*radius*radius;
    }
    public double sarface(){
        return 2*3.14*radius*height+2*3.14*radius*radius;
    }
    public cylinder(){
        radius=5;
        height=9;
    }
    public cylinder(int radius,int height){
        this.radius=radius;
        this.height=height;
    }
}
class privat{
    public static void main(String[] args) {
       cylinder cy=new cylinder(5,8);
       //cy.setr(3);
       //cy. seth(10);
       System.out.println(cy.geth());
       System.out.println(cy.getr());
       System.out.println(cy.volume());
       System.out.println(cy.sarface());
    }
}