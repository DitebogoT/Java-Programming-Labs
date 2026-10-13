public class StudentDetails {
String name = "Naledi";
int age = 20;
boolean Registration = true;
double average = 76.5;



static void printStudents(){
    StudentDetails student = new StudentDetails();
        System.out.println("Student name:" + student.name);
        System.out.println("Age:" + student.age);
        System.out.println("Average Mark:" + student.average);
        System.out.println("Registered:" + student.Registration);
    }
}
