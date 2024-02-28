import java.util.Scanner;

public class student {
    private String Name;
    private int  rollNo;
    private float marks;
    private float marks1;
    private float marks2;
    private float totalMarks;

    public  void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Roll Number:");
        rollNo = sc.nextInt();
        
        sc.nextLine(); 
        System.out.println("Enter Name:");
        Name = sc.nextLine();

        System.out.println("Enter Marks in Three Subjects:");
        marks = sc.nextFloat();
        marks1 = sc.nextFloat();
        marks2 = sc.nextFloat();
    }
    public void calculateMarks() {
        totalMarks = marks + marks1 + marks2;
    }
    public void show() {
        System.out.println("Student Information:");
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + Name);
        System.out.println("Marks in Subject 1: " + marks);
        System.out.println("Marks in Subject 2: " + marks1);
        System.out.println("Marks in Subject 3: " + marks2);
        System.out.println("Total Marks: " + totalMarks);
    }
    void copyobj(student s){
        rollNo =s.rollNo; 
        Name = s.Name;
        marks = s.marks;
        marks1 = s.marks1;
        marks2 = s.marks2;
       totalMarks=s.totalMarks;
    }
    
}

