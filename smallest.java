public class smallest {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 4, 5, 91, 12, 36 };
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min)
                min = a[i];
        }
        System.out.println("Smallest element present in given array: " + min);
    }

}
