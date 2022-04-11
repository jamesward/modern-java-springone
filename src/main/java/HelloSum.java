public class HelloSum {

    sealed interface Robot
            permits Vacuum, SnowBlower, LawnMower { }

    static final class Vacuum implements Robot {
        public void suck() {
            System.out.println("shhhhhhh");
        }
    }

    static final class SnowBlower implements Robot {
        public void blow() {
            System.out.println("chggggg");
        }
    }

    static final class LawnMower implements Robot {
        public void cut() {
            System.out.println("bzzzzzz");
        }
    }

    static void robotStuff(Robot robot) {

        // old way
        if (robot instanceof Vacuum) {
            ((Vacuum) robot).suck();
        }

        // new way "pattern match" / type predicate cast
        if (robot instanceof Vacuum v) {
            v.suck();
        }

        switch (robot) {
            case Vacuum v     -> v.suck();
            case SnowBlower s -> s.blow();
            case LawnMower l  -> l.cut();
        }
    }

    public static void main(String[] args) {
        robotStuff(new Vacuum());
    }
}
