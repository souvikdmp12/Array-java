public class oddpositon {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 3, 4, 5, 6 };
        System.out.println("elements of given array presents on odd position");
        for (int i = 0; i < a.length; i = i + 2) {
            System.out.println(a[i]);
        }
    }

}
