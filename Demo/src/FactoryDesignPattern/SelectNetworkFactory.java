package FactoryDesignPattern;

public class SelectNetworkFactory {

    public CellulorPlan getPlan(String plan) {

        if (plan == null) {
            return null;
        }
        if (plan.equalsIgnoreCase("ABCNetwork")) {
            return new ABCNetwork();
        } else if (plan.equalsIgnoreCase("PQRNetwork")) {
            return new PQRNetwork();
        } else if (plan.equalsIgnoreCase("XYZNetwork")) {
            return new XYZNetwork();
        }else{
            throw new NetworkNotFound("No such network exists");
        }

    }
}
