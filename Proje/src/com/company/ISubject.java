package com.company;

public interface ISubject {
    public void attach(IObserver obs);
    public void detach(IObserver obs);
    public void notify(int d);
}
