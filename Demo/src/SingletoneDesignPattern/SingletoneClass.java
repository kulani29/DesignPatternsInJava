package SingletoneDesignPattern;

public class SingletoneClass implements Cloneable {

    private static SingletoneClass singletoneClassInstance = null;
    private int num;

    public int getNum() {
        return num;
    }

    private SingletoneClass(int num) {
        this.num = num;
        System.out.println("Constructor of Singletone invoked");
    }


    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public static synchronized SingletoneClass getInstance(int num) {
        if (singletoneClassInstance == null) {
            singletoneClassInstance = new SingletoneClass(num);
        }
        return singletoneClassInstance;

    }
}
