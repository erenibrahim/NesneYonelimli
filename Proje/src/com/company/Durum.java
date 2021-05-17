package com.company;

public class Durum implements IDurum{
    String durum = "Kapalı";
    @Override
    public void setDurum(int durum) {
        if(durum == 0){
            this.durum = "Kapalı";
        }
        else if( durum == 1){
            this.durum = "Bekleme";
        }
        else if( durum == 2){
            this.durum = "Algılama";
        }
        else if( durum == 3){
            this.durum = "Servis Dışı";
        }
        else if( durum == 4){
            this.durum = "İşlem Yapılıyor";
        }
    }

    @Override
    public String getDurum() {
        return this.durum;
    }
}
