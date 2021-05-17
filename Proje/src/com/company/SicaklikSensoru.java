package com.company;
import java.util.Random;

public class SicaklikSensoru implements ISıcaklıkSensoru{
    Random rand = new Random();
    int sicaklik;
    ISubject publisher;

    public SicaklikSensoru(ISubject publisher) {
        this.publisher = publisher;
    }
    @Override
    public void Sicaklik() {
        sicaklik = rand.nextInt(40);
        publisher.notify(sicaklik);
    }
}
