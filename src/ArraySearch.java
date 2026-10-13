public class ArraySearch {

    static void searchArray() {
        int[] numbers = { 5, 8, 12, 8, 20, 8, 33 };
        int numberWanted = 8;

        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == numberWanted) {
                System.out.println("Target found at index: " + i);
                found = true;
            }
        }
        System.out.println();
        if (!found) {
            System.out.println("Value not found");
            System.out.println();
        }

    }
}
//Create ArraySearch.
//Search an integer array for a target value.
//Display its index if found, or Value not found otherwise.
//        Challenge: Report every matching index if the target appears more than once.
