package com.oleg.store;

public class StoreConsumer implements Runnable{

    private Store store;

    public StoreConsumer(Store store){
        this.store=store;
    }

    public void run(){
        for (int i = 1; i < 6; i++) {
            store.get();
            System.out.println("Всего забрано товаров со склада: "+i);
        }
    }
}
