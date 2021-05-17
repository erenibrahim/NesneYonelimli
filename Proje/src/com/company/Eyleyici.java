package com.company;

public class Eyleyici implements IEyleyici{
    private ISogutucu sogutucu;
    private IKonsol konsol;
    Eyleyici(EyleyiciBuilder builder){
        this.sogutucu = builder.sogutucu;
        this.konsol = builder.konsol;
    }
    public void SogutuAc() {
        sogutucu.SogutucuAc(konsol);
    }

    public void SogutucuKapat() {
        sogutucu.SogutucuKapat(konsol);
    }
}
