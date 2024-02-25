//DRY-do't repeat yourself
/*class dog{
    public void hugry(){
    System.out.println("very hugry");
}
}
class cat extends dog{
    public void name(){
        System.out.println("cat name is simmi");
    }
}

class inheritance{
    public static void main(String[] args) {
        cat c= new cat();
        c.hugry();
        c.name();
    }
}
*/

//
class circle{
    public int radius;
    
    public circle(int radius){
           this.radius=radius;
    }
   public double area(){
     return Math.PI*radius*radius;
   }
}
class cylinder extends circle{
public int hight;
public cylinder(int radius,int hight){
   super(radius);
      this.hight=hight;
}
public double volume(){
return Math.PI*radius*radius*hight;}
}
class inheritance{
    public static void main(String[] args) {
        //circle c=new circle(6);
        cylinder cy=new cylinder(9,9);
        System.out.println(cy.area());
        System.out.println(cy.volume());

    }
}