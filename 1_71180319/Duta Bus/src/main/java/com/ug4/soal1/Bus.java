package com.ug4.soal1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Bus {
    private String name;

    private Driver driver;

    private int CAPACITY = 25;

    private final ArrayList<Passenger> passenger = new ArrayList<>();

    private int usedCapasity;

    private final double fares = 10000;

    private double profit;

    private String[] ROUTE;

    public bus(String name, Driver driver){
        this.name = name;
        this.driver = driver;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Driver setDriver(){
        return driver;
    }
    public void setDriver(Driver driver){
        this.diver = driver;
    }
    public int getCAPACITY (){
        return CAPACITY;
    }
    public ArrayList<Passenger> getPassenger(){
        return passenger;
    }
    public int getUsedCapasity(){
        return usedCapasity;
    }
    public void setUsedCapasity(int usedCapasity){
        if(usedCapasity<CAPACITY)
            this.usedCapasity += usedCapasity;
    }
    public double getFares(){
        return fares;
    }
    public double getProfit(){
        return profit;
    }

    public String[] getROUTE() {
        return ROUTE;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }
    public boolean checkPassengerBalance(Passenger penumpang){
        boolean status = false;
        if(penumpang.getBalance() > getFares() && penumpang.getBalance()> 0){
            status = true;
        }
        public topUpBalance(double jumlah, Passenger penumpang){
            if(jumlah > 0)
                penumpang.setBalance(jumlah);
        }
        public void takePassenger(Passenger penumpang){

        }
        public void dropPassenger(String tujuan, Passenger penumpang){
            if(tujuan == penumpang.getDestiny()){
                penumpang.clear;
            }
            public void procesdOrder(String order, Passenger penumpang){

            }
            public String cancelOrder(Passenger penumpang){
                return penumpang.getName();
            }
        }
    }
}
