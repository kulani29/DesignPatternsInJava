package SingletoneDesignPattern;

public class SingleToneTest {

    public static void main(String[] args) {
        SingletoneClass s1 = SingletoneClass.getInstance(1);
        SingletoneClass s2 = SingletoneClass.getInstance(2);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

    }
}
