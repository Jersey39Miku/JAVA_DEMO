public class DrawTriangle {
    public static String vt = "";

    public static void addnote(int count) {
        for (int i = 1; i <= count; i++) {
            DrawTriangle.vt += "*";
            System.out.println(DrawTriangle.vt);
        }

    }

    public static void main(String[] args) {

        addnote(7);

    }
}