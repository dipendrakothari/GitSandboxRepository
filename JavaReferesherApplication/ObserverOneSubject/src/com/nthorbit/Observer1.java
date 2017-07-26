package com.nthorbit;


public class Observer1 implements IObserver {
    
    @Override
    public void update(int i) {
        System.out.println("Flag value changed in Subject to:  " + i);
    }
}
