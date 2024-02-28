// public class copy {
//     public static void main(String[] args) {


//         // IN  10THA THERE WERE  5 STUDENTS
//         // student[] students1 = new student[5];
//         // for (int i =  0; i <  5; i++) {
//         //     students1[i] = new student();
//         //     students1[i].getData();
//         //     students1[i].calculateMarks();
//         //     students1[i].show();

//         // }

//         // // SECOND CLASS
//         // student[] students2 = new student[5];
//         // for (int i =  0; i <  5; i++) {
//         //     students2[i] = new student();
//         //     students2[i].getData();
//         //     students2[i].calculateMarks();
//         //     students2[i].show();
//         // }



//     //    IN 10THA THERE WRE 5 STUDENT
       
//         student s1= new student();
//         student s2= new student();
//         student s3= new student();
//         student s4= new student();
//         student s5= new student();

//         s1.getData();
//         s2.getData();
//         s3.getData();
//         s4.getData();
//         s5.getData();

//         s1.calculateMarks();
//         s2.calculateMarks();
//         s3.calculateMarks();
//         s4.calculateMarks();
//         s5.calculateMarks();
//         s1.show();
//         s2.show();
//         s3.show();
//         s4.show();
//         s5.show();
      
      
       
   
// // SECOND CLASS
// student s6= new student();
// student s7= new student();
// student s8= new student();
// student s9= new student();
// student s10= new student();

// s6.getData();
// s7.getData();
// s8.getData();
// s9.getData();
// s10.getData();

// s6.calculateMarks();
// s7.calculateMarks();
// s8.calculateMarks();
// s9.calculateMarks();
// s10.calculateMarks();
// s6.show();
// s7.show();
// s8.show();
// s9.show();
// s10.show();

// public class student {
//     private String name;
//     private int rollNo;
//     private int marks;

//     // ... (other methods and fields)

//     // Method to compare two students
//     public boolean equals(student otherStudent) {
//         return this.name.equals(otherStudent.name) && this.rollNo == otherStudent.rollNo && this.marks == otherStudent.marks;
//     }

//     // ... (other methods)
// }

public class copy {
    public static void main(String[] args) {
        // IN 10THA THERE WERE 5 STUDENTS
        student[] students1 = new student[5];
        for (int i = 0; i < 5; i++) {
            students1[i] = new student();
            students1[i].getData();
            students1[i].calculateMarks();
            students1[i].show();
        }

        // SECOND CLASS
        student[] students2 = new student[5];
        for (int i = 0; i < 5; i++) {
            students2[i] = new student();
            students2[i].getData();
            students2[i].calculateMarks();
            students2[i].show();
        }

     
        for (int i = 0; i < 5; i++) {
            if (students1[i].equals(students2[i])) {
                System.out.println("Student " + (i + 1) + " is the same in both classes.");
            } else {
                System.out.println("Student " + (i + 1) + " is different in both classes.");
            }
        }
    }
}



       
        
        

    