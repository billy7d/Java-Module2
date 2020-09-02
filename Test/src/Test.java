import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int array[] = { 6, 7, 0, 2, 8, 1, 3, 9, 4, 5 };
        Test.sort(array);
        for (int i =0;i< array.length;i++){
            System.out.println(array[i]+" ");
        }

    }
    public static int[] sort(int[] array){
        int minIndex;
        for (int i =0;i<array.length -1;i++){
            minIndex = i;
            for (int j = i+1;j<array.length;j++){
                if (array[j]<array[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex!=i) {
                    int temp  = array[i];
                    array[i] =array[minIndex];
                    array[minIndex] = temp;


            }
        }
        return array;
    }
}
