public class MAX {
    public static int getmax(int[] m) {
        int oringinal_max = m[0];
        for (int i = 0; i < m.length; i++) {
            if (m[i] > oringinal_max) {
                oringinal_max = m[i];
            }
        }
        return oringinal_max;
    }

    public static void main(String[] args) {
        int[] numbers = new int[7];
        numbers[0] = 9;
        numbers[1] = 2;
        numbers[2] = 15;
        numbers[3] = 200;
        numbers[4] = 22;
        numbers[5] = 10;
        numbers[6] = 6;
        System.out.println(getmax(numbers));
    }
}