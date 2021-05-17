package com.company;

public class EyleyiciBuilder {
    public ISogutucu sogutucu;
    public IKonsol konsol;
    public EyleyiciBuilder(ISogutucu sogutucu){
        this.sogutucu = sogutucu;
    }
    public EyleyiciBuilder konsol(IKonsol konsol){
        this.konsol = konsol;
        return this;
    }
    public Eyleyici build(){
        return new Eyleyici (this);
    }
}
