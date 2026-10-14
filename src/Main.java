import java.util.Scanner;
import java.util.ArrayList;
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

        LoginCheck checker = new LoginCheck();
        checker.Check();

        StudentMarks.printMarks();

        ArrayStatistics.getMinMax();

        ArraySearch.searchArray();

        EvenOddArray.EvenOddPrint();

        ReverseArray.ReverseElements();

        Student studentDetails = new Student("Ditebogo","221393439",89);
        studentDetails.displayDetails();
        studentDetails.hasPassed();

        BankAccount bank = new BankAccount("Kopano","3442561426",35000);
        bank.getBalance();
        bank.Deposit(4000);
        bank.Withdraw(2000);

        Car car = new Car("Red","BMW","M2",2019);
        Car car2 = new Car("Blue","Audi","RS3",2025);
        Car car3 = new Car("Green","Mercedes","C63",2023);

        Car[] cars = {car,car2,car3};
        for (int i = 0; i < cars.length; i++ )
        {
            cars[i].Display();
        }

    }
}