public class GradeCalculator {
    int Mark = 65;

    static void getGrade(){
        GradeCalculator grade = new GradeCalculator();

        if (grade.Mark<0 || grade.Mark>100){
            System.out.println("You've entered an invalid number, please try again.");
            System.out.println();
        }

        if (grade.Mark >= 80)
        {
            System.out.println("You've obtained a distinction.");
            System.out.println();
        } else if (grade.Mark >= 70 && grade.Mark <80 ) {
            System.out.println("You've obtained a merit.");
            System.out.println();
        } else if (grade.Mark >= 50 && grade.Mark <70 ) {
            System.out.println("You've passed.");
            System.out.println();
        } else if (grade.Mark >= 0 && grade.Mark <50) {
            System.out.println("You have failed.");
            System.out.println();
        }
    }
}
