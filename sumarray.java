public class sumarray {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 4, 5, 7, 6 };
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println("Sum of all the elements of an array : " + sum);
    }

}
