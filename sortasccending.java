public class sortasccending {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 7, 2, 5, 4, 3 };
        int temp = 0;
        System.out.println("Element of orriginal array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }
            }
        }
        System.out.println();
        System.out.println("Ascending array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }

    }
}
