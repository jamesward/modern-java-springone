import java.util.Set;

public class HelloNullHelp {

    record Plumbus(String s) { }
    record Thing(Plumbus plumbus) { }
    record MeSeeks(Thing thing) { }

    public static void main(String[] args) {

        var meSeeks1 = new MeSeeks(new Thing(new Plumbus("hello")));
        var meSeeks2 = new MeSeeks(new Thing(null));

        var meSeeks = Set.of(meSeeks1, meSeeks2);

        meSeeks.forEach(it -> System.out.println(it.thing.plumbus.s));
    }
}
