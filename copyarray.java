public class copyarray {
    public static void main(String[] args) {
        int a1[] = new int[] { 1, 2, 3, 4, 5 };
        int a2[] = new int[5];

        for (int i = 0; i < a1.length; i++) {
            a2[i] = a1[i];
        }

        System.out.println("Elements of Original array : ");
        for (int i = 0; i < a1.length; i++) {
            System.out.print(a1[i] + ",");
        }
        System.out.println();

        System.out.println("Elements of New array : ");
        for (int i = 0; i < a2.length; i++) {
            System.out.print(a2[i] + ",");
        }

    }
}