package com.oleg.store;

public class Main {

    public static void main(String[] args) {
        Store store=new Store();
        StoreProducer producer = new StoreProducer(store);
        StoreConsumer consumer = new StoreConsumer(store);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
