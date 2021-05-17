package com.company;

import java.util.Random;

public class SicaklikCelcius implements  IObserver{
    @Override
    public void update(int mesaj) {
        System.out.println("Sıcaklık Celcius->" + mesaj);
    }
}
