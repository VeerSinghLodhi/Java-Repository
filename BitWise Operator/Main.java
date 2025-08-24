
public class Main {

    public String getChar(String text) {
        if ("".equals(text) && text.isEmpty()) {
            return text;
        }
        return text.substring(0, 1).toUpperCase() + text.substring(1);
    }

    public static void main(String[] args) {
        Main m1 = new Main();
        System.out.println(m1.getChar("veer singh"));
    }
}
