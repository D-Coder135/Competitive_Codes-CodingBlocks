package level3;

public class III_LastIndex {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 8, 2, 5, 4, 24, 5, 5, 7};
        System.out.println(lastIndex(array, array.length - 1, 5));
    }

    public static int lastIndex(int[] array, int i, int item) {
        if (i < 0) {
            return -1;
        }

        if (array[i] == item) {
            return i;
        }
        return 0;
    }
}
