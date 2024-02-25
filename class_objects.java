/* 
class employe{                          //custom class
   String name;
   int age;
   int salary;
   public void salary(){
    System.out.println(name+ " "+"salary is"+" "+ salary);
   }
    public int incomes(int n){
        return n+1;
   }
   public int salary1(){
    return salary;
   }
}


class class_objects{
    public static void main(String[] args) {
        employe em=new employe();
        employe pm=new employe();
        pm.name="ramesh";
        pm.salary=4000;
        pm.salary();
        em.age=23;
        em.name="mukesh";
        em.salary=100000;
        em.salary();
        System.out.println(em.salary1());
       System.out.println(em.incomes(87)); 
    }
}*/

class square{
         int side;
         public int area(){
            return side*side;
         }
         public int perimeter(){
            return 4*side;
         }
}

class class_objects{
    public static void main(String[] args) {
      square s= new square();
      s.side=8;
      System.out.println(s.area());
      System.out.println(s.perimeter());
    }
}