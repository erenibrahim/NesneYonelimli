package com.company;

import java.util.Random;

public class SicaklikKelvin implements  IObserver{
    @Override
    public void update(int mesaj) {
        System.out.println("Sıcaklık Kelvin->" + (mesaj+273));
    }
}
