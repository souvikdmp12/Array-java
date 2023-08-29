public class evenpostionarray {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 3, 4, 5 };
        System.out.println("Elements of given array presents on even position");
        for (int i = 1; i < a.length; i = i + 2) {
            System.out.println(a[i]);
        }
    }

}
