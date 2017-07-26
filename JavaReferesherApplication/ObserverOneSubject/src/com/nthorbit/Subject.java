package com.nthorbit;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject {
    List<IObserver> observerList = new ArrayList<IObserver>();
    private int _flag;

    public int getFlag() {
        return _flag;
    }

    public void setFlag(int _flag) {
        this._flag = _flag;
        //flag value changed .So notify observer(s)
        notifyObservers();
    }

    @Override
    public void register(IObserver o) {
        observerList.add(o);
    }

    @Override
    public void unregister(IObserver o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observerList.size(); i++) {
            observerList.get(i).update(getFlag());
        }
    }
}
