package task2;

import java.util.Arrays;

public class Part3 {

    public static void array() {

        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.stream(myArray).filter(e -> e % 2 == 0).forEach(System.out::println);
    }
}
