public class Student {

    String studentName ;
    String studentNumber;
    double studentMark;

    //Constructor
    public Student(String StudentName,String StudentNumber,double StudentMark){
        this.studentName = StudentName;
        this.studentNumber = StudentNumber;
        this.studentMark = StudentMark;
    }
    void displayDetails()
    {

        System.out.println("Student name: " + this.studentName);
        System.out.println("Student number:" + this.studentNumber);
        System.out.println("Students mark:" + this.studentMark);
    }
    void hasPassed(){

        if (this.studentMark >= 50)
        {
            System.out.println("Student has passed");
        }
        else{
            System.out.println("Student hasn't passed");
        }
    }
}
//Create a Student class with name (String), studentNumber (String), and mark (double).
//Add a constructor, displayDetails(), and hasPassed() which returns true when the mark is at least 50.
//
//In StudentApp, create at least two Student objects and call their methods.
