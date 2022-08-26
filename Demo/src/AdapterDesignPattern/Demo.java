package AdapterDesignPattern;

public class Demo {

    public static void main(String[] args) {

        Sparrow sparrow = new Sparrow();
        ToyDuck toyDuck = new PlasticToyDuck();

        ToyDuck birdAdapter = new BirdAdapter(sparrow);
        sparrow.fly();
        sparrow.makeSound();

        toyDuck.squeak();

        BirdAdapter adapter = new BirdAdapter(sparrow);
        adapter.squeak();


    }
}
