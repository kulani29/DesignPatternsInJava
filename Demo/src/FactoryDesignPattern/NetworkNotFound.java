package FactoryDesignPattern;

public class NetworkNotFound extends RuntimeException{

    public NetworkNotFound(String messesge) {
        super(messesge);
    }
}
