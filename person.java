import java.util.Scanner; 
 
class Person {    
 protected String name;   
   protected String address; 
 
    // Constructor for Person class    
     public Person() {  
       name = "";       
  address = ""; 
    } 
 
    // Method to accept person details   
      public void Accept() { 
        Scanner scanner = new Scanner(System.in);     
            System.out.print("Enter Name: ");     
    name = scanner.nextLine();     
        System.out.print("Enter Address: ");       
          address = scanner.nextLine(); 
    }  
// Method to display person details 
    public void Display() { 
        System.out.println("Name: " + name); 
        System.out.println("Address: " + address); 
    } 
} 
 
class Student extends Person {    
     private int rollNo;   
  private String course; 
 
    // Constructor for Student class    
     public Student() { 
        super(); 
// Invoke base class constructor      
   rollNo = 0;       
  course = ""; 
    } 
 
    // Method to accept student details    
     public void Accept() {      
   super.Accept(); 
// Invoke base class method 
        Scanner scanner = new Scanner(System.in);      
           System.out.print("Enter Roll Number: ");     
               rollNo = scanner.nextInt();       
                 scanner.nextLine(); // Consume newline         
                 System.out.print("Enter Course: ");      
   course = scanner.nextLine(); 
    } 
 
    // Method to display student details
     public void Display() {        
 super.Display(); // Invoke base classmethod 
        System.out.println("Roll Number: " + rollNo); 
        System.out.println("Course: " + course); 
    } 
} 
 
class Employee extends Person {    
     private int empId;   
  private String department; 
 
    // Constructor for Employee class 
    public Employee() {      
   super();
 // Invoke base class constructor       
  empId = 0;        
 department = ""; 
    } 
 
    // Method to accept employee details   
  public void Accept() {        
 super.Accept(); 
// Invoke base class method 
        Scanner scanner = new Scanner(System.in);      
           System.out.print("Enter Employee ID: ");    
                empId = scanner.nextInt();       
  scanner.nextLine(); // Consume newline       
    System.out.print("Enter Department: ");        
     department = scanner.nextLine(); 
    } 
 
    // Method to display employee details
     public void Display() { 
        super.Display(); // Invoke base class method 
        System.out.println("Employee ID: " + empId); 
        System.out.println("Department: " + department); 
    } 

 

   public static void main(String[] args) { 
        Student student = new Student();   
              System.out.println("Enter Student Details:");     
                  student.Accept(); 
        System.out.println("\nStudent Details:");      
           student.Display(); 
 
        Employee employee = new Employee();      
           System.out.println("\nEnter Employee Details:");     
               employee.Accept(); 
        System.out.println("\nEmployee Details:");        
         employee.Display(); 
    } 
} 
 
