import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StudentDetails student = new StudentDetails();
        student.printStudents();

        ShoppingTotal shopping = new ShoppingTotal();
        shopping.printCalculations();

        TemperatureConverter tempCon = new TemperatureConverter();
        tempCon.getFahrenheit();

        PassOrFail passOrFail = new PassOrFail();
        passOrFail.getResult();

        GradeCalculator grade = new GradeCalculator();
        grade.getGrade();

        NumberAnalysis analysis = new NumberAnalysis();
        analysis.Analysis();

    }
}