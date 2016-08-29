package kilim.examples;

import kilim.Pausable;
import kilim.Task;

import java.util.stream.Stream;

/*
    test of a number of ways of invoking a method that are or look similar to SAMs
    added for: https://github.com/kilim/kilim/issues/38
*/
public class Userdata
        extends Task
{
    Eats1 eats1 = new Eats1Impl();
    Eats2 eats2 = new Eats2();

    public static void eater(Eats4 eat, int kfood)
            throws Pausable
    {
        eat.insert1(kfood);
    }

    public static void main(String[] args)
    {
        new Userdata().start();
    }

    public void execute()
            throws kilim.Pausable
    {
        eats1.insert1(0);
        eats2.insert1(0);
        new Eats3().insert1(0);
        eater(kfood -> System.out.println("lam"), 0);
        Stream.of(0, 1, 2, 3, 4).forEach(System.out::println);
        System.exit(0);
    }

    public interface Eats1
    {
        public void insert1(int kfood)
                throws Pausable;
    }

    public interface Eats4
    {
        public void insert1(int kfood)
                throws Pausable;
    }

    public static class Eats1Impl
            implements Eats1
    {
        public void insert1(int kfood)
                throws Pausable
        { System.out.println("gah"); }
    }

    public static class Eats2
    {
        public void insert1(int kfood)
                throws Pausable
        { System.out.println("foo"); }

        public void insert2(int kfood)
                throws Pausable
        {}
    }

    public static class Eats3
    {
        public void insert1(int kfood)
                throws Pausable
        { System.out.println("bar"); }
    }
}
