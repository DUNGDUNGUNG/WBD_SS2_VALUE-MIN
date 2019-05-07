public class ValueMin {
    public static void main(String[] args) {
        int[] arr = {4, 13, 2, 4, 5, 6, 1};
        int index = minValue(arr);
        for (int i : arr) {
            System.out.print("Array element list : " + i + "\t");
        }
        System.out.println(" \n The smallest element in the array is: " + arr[index]);

    }

    private static int minValue(int[] array) {
        int min = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

}
