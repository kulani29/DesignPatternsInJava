package FactoryDesignPattern;

import java.util.Scanner;

public class PhoneBill {

    public static void main(String[] args) {
       System.out.println("Enter the network:");
        Scanner sc=new Scanner(System.in);
        String networkName=sc.next();
        System.out.println("Enter minutes required:");
        Scanner sc2=new Scanner(System.in);
        int minutes =sc2.nextInt();

        SelectNetworkFactory sn=new SelectNetworkFactory();
        CellulorPlan plan =sn.getPlan(networkName);
       System.out.println("Total Cost for  "+networkName+ "  is "+plan.getRate()*minutes);
    }
}
