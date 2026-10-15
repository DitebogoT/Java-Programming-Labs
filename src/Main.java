import java.util.List;
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
        System.out.println();

        Product prod = new Product(95,"Marie Biscuits",45.00,5);
        Product prod2 = new Product(75,"Nivea Lotion",85.00,8);
        Product prod3 = new Product(45,"Colgate",25.00,6);

        Product[] prods = {prod,prod2,prod3};
        for (int i = 0; i < prods.length; i++)
        {
            prods[i].displayDetails();
            prods[i].stockValue();
        }
        System.out.println();

        Rectangle rect = new Rectangle(56,87);
        Rectangle rect1 = new Rectangle(13,27);

        Rectangle[] shapes = {rect,rect1};
        for (int i = 0; i < shapes.length; i++)
        {
            shapes[i].Area();
            shapes[i].Perimeter();
        }
        System.out.println();

        Student_ student1 = new Student_("Magwaza","221393439",new int[]{56,87,98});
        Student_ student2 = new Student_("Rodney","221233449",new int[]{5,80,72});
        Student_ student3 = new Student_("ChilliBite","211395439",new int[]{43,65,78});

        Student_[] studentS = {student1,student2,student3};

        String res = "" ;

        for (Student_ st : studentS)
        {

            st.setAvg(st.Average());

            res += "\n" + "Student " + st.studentName + " Avg " + st.Average() + " " + st.hasPassed();

        }

        System.out.println(res);

        double max = studentS[0].avg;
        Student_ st = null;

        for (int i = 0; i < studentS.length; i++)
        {
            if ( max <= studentS[i].avg )
            {

                max = studentS[i].avg;
                st = studentS[i];
            }
        }
        System.out.println(st.toString());


    }
}