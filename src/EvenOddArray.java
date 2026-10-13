import java.util.ArrayList;

public class EvenOddArray {
    static void EvenOddPrint()
    {
        int[] numbers = { 5, 8, 12, 17, 20, 55, 33 };
        ArrayList<Integer> even = new ArrayList<>() ;
        ArrayList<Integer> odd = new ArrayList<>() ;

        for(int n : numbers)
        {
            if(n % 2 == 0)
            {
                even.add(n);
            }
            else{
                odd.add(n);
            }
        }

        System.out.println("The amount of even numbers are: "+ even.size());
        System.out.println("The amount of odd numbers are: "+ odd.size());
        System.out.println();
    }
}

//Separate even and odd numbers
//Create EvenOddArray. Count the even and odd values in an integer array.
//
//Challenge: Store the even and odd values in separate arrays or lists.
