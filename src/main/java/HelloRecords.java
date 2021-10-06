public class HelloRecords {

    // fancy immutable data class
    record Point(int x, int y) { }

    public static void main(String[] args) {
        // fancy type inference
        var point = new Point(1, 2);

        // point.x = 3;

        System.out.println(point);

        // fancy text block!
        System.out.printf("""
                x = %s
                y = %s
                """, point.x() ,point.y());

        // fancy memory compaction
        var points = new Point[] {point, point};
    }

}
