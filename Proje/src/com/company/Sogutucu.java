package com.company;

public class Sogutucu implements ISogutucu{
private int acik = 0;
//IKonsol konsol = new Konsol();
    public void SogutucuAc(IKonsol konsol) {
        if(acik == 0){
        acik = 1;
        konsol.Yaz("Soğutucu açıldı.");
        }
        else{
        konsol.Yaz("Hata sogutucu zaten açık.");
        }
    }

    public void SogutucuKapat(IKonsol konsol) {
        if(acik == 1){
            acik = 0;
            konsol.Yaz("Soğutucu kapatıldı.");
        }
        else{
            konsol.Yaz("Hata sogutucu zaten kapalı.");
        }
    }

    public boolean AcikMi() {
        if(acik == 0){
            return false;
        }
        else{
            return true;
        }
    }
}
