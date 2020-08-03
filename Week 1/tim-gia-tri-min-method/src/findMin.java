public class findMin {
    public static void main(String[] args) {
    int[] arr = {4, 12, 7, 8, 1, 6, 9};



    System.out.println("The smallest element in the array is: " + minValue(arr));

    }


    public static int minValue(int [] array){
        int min = array[0];
        int index = 1;

        for (int i =0;i< array.length;i++){
            if (min>array[i]){
                min = array[i];
                index = 1 +i;


            }

        } System.out.println("At position: " + index);
        return min;
    }

}
