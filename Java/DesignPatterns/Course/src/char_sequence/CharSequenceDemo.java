package char_sequence;

public class CharSequenceDemo {
    public static void main(String[] args) {
        testString();
        testStringBuffer();
        testStringBuilder();
    }

    public static void testString() {
        long begin = System.currentTimeMillis();
        String str = "";

        for (int i = 0; i < 30000; i++) {
            str += i;
        }

        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }

    public static void testStringBuffer() {
        long begin = System.currentTimeMillis();
        StringBuffer str = new StringBuffer("");

        for (int i = 0; i < 30000; i++) {
            str.append(i);
        }

        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }

    public static void testStringBuilder() {
        long begin = System.currentTimeMillis();

        StringBuilder str = new StringBuilder("");

        for (int i = 0; i < 30000; i ++) {
            str.append(i);
        }

        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }
}
