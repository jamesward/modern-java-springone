import java.util.Objects;

public class HelloRecords {

    // fancy immutable data class
    record Point(int x, int y) { }

    public static void main(String[] args) {
        // fancy type inference
        var point = new Point(1, 2);

        // fancy text block!
        System.out.printf("""
                x = %s
                y = %s
                """, point.x() ,point.y());

        var points = new Point[] {point, point};
    }

}
