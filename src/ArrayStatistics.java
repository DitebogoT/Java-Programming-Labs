public class ArrayStatistics {

    static void getMinMax(){
        int [] arrayStatistics = {54, 67, 11, 98, 32, 71};
        int max = arrayStatistics[0];
        int min = arrayStatistics[0];

        for (int n : arrayStatistics) {
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("The number of elements are "+ arrayStatistics.length);
    }

}
//Create ArrayStatistics.
//Use an array of at least six integers to find the largest value, smallest value, and number of elements.
//
//        Challenge: Count how many values are greater than or equal to 50.