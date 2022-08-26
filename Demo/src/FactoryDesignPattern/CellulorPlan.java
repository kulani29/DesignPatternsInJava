package FactoryDesignPattern;

public abstract class CellulorPlan {
    protected double rate;
    abstract double getRate();

    public void processBill(int minutes){
        System.out.println(minutes*rate);
    }

}
