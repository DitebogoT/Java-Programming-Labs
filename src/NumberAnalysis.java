public class NumberAnalysis {
    int number = 48;
    static void Analysis(){
        NumberAnalysis analysis = new NumberAnalysis();
        if (analysis.number >= 0 && analysis.number % 2 == 0)
        {
            System.out.println("The number is positive and it is even");
            System.out.println();
        }else if(analysis.number >= 0 && analysis.number % 2 != 0 ){
            System.out.println("The number is positive and it is odd");
            System.out.println();
        } else if (analysis.number < 0 && analysis.number % 2 == 0) {
            System.out.println("The number is negative and it is even");
            System.out.println();
        } else if (analysis.number < 0 && analysis.number % 2 != 0) {
            System.out.println("The number is negative and it is odd");
            System.out.println();

        }

    }
}
