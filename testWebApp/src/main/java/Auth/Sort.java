package Auth;

public class Sort {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = new int[10];

        for(int i = 0; i < array1.length; i++) {
            array1[i] = 10 - i;
            array2[i] = 10 - i;
        }

        printArray(array1, "Array1");
        printArray(array2, "Array2");

        array1 = sort(array1);
        sort(array2);

        printArray(array1, "Array1");
        printArray(array2, "Array2");

    }

    public static int[] sort(int[] array) {

        for(int i = 0; i < array.length; i++)
            for(int j = 0; j < array.length - 1; j++) {
                if(array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }

            }

        return array;
    }

    public static void sort2(int[] array) {

        for(int i = 0; i < array.length; i++)
            for(int j = 0; j < array.length - 1; j++) {
                if(array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
    }

    public static void printArray(int[] array, String name) {
        System.out.println("\n-----Begin of listing of " + name + "-------");
        for(int i : array)
            System.out.print(i + " ");
        System.out.println("\n-----End of listing of " + name + "-------");
    }
}
