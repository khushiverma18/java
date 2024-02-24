 /*class collage{
  int a;
  int b;
  public int student(){
    return a+b;
  }
  public collage(){
    a=3;
    b=5;
  }
}
 public class constructor{
    public static void main(String[] args) {
        collage c=new collage();
        c.a=2;
        c.b=5;
       System.out.println(c.student()); 
    }
}
*/
//constructor overlodded
class school{
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
      public school(){
        name="muskan";
        age=24;
      }
      public school(int a){
        name="muskan";
        age=a;
      }
}

class constructor{
    public static void main(String[] args) {
        school s=new school(24);
        System.out.println(s.getdata());
        System.out.println(s.getid());
    }
}