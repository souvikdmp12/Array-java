public class reversearray {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 3, 45, 58 };
        System.out.println("Original array:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println();
        System.out.println("Reverse array:");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + ",");
        }
    }

}
