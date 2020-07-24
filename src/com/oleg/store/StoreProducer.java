package com.oleg.store;

public class StoreProducer implements Runnable{

    private Store store;

    public StoreProducer(Store store){
        this.store=store;
    }

    public void run(){
        for (int i = 1; i < 6; i++) {
            store.put();
        }
    }
}
