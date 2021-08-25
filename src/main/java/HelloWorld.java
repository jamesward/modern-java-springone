
public class HelloWorld {

    record Point(int x, int y) { }

    public static void main(String[] args) {
        var point = new Point(1, 2);
        System.out.printf("""
                x = %s
                y = %s
                """, point.x() ,point.y());
    }

}
