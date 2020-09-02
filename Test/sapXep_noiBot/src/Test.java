public class Test {
   public static int[] sort(int[] arr){
       boolean swapped = false;
       for (int i =1; i< arr.length;i++){
           swapped =false;
           for (int j = 0; j<arr.length -i;j++){
               if (arr[j]>arr[j+1]){
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] =temp;

                   swapped =true;
               }
           }
           if (swapped == false)
               break;
       }
       return arr;
   }

    public static void main(String[] args) {
        int[] arr = { 6, 7, 0, 2, 8, 1, 3, 9, 4, 5 };
        Test.sort(arr);
        for (int i: arr)
            System.out.println(i);
    }
}
