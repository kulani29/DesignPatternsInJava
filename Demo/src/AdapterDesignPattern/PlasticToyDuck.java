package AdapterDesignPattern;

public class PlasticToyDuck implements ToyDuck {

    @Override
    public void squeak() {
        System.out.println("PlasticToyDuck is making squeak");
    }
}
