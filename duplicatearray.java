public class duplicatearray {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 2, 3, 5, 5 };
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j])
                    System.out.print(a[j] + ",");
            }
        }
    }

}
