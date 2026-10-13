import java.util.ArrayList;
import java.util.Arrays;
public class ReverseArray {

    static void ReverseElements(){
        String [] Flowers = {"Roses","Lilies","Sunflower","Tulip","Daisy","Orchid"};

        StringBuilder r = new StringBuilder();

        for (int i = Flowers.length; i > 0; i--) {
            r.append(Flowers[i - 1]).append(" ");
        };

        String[] reversed = r.toString().split(" ");

        System.out.println(Arrays.toString(reversed));

    }

}
//Reverse an array
//Create ReverseArray. Display the array in reverse order without changing the original array.
//Challenge: Reverse the array in place by swapping elements.