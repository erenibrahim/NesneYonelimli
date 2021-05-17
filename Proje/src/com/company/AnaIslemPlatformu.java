package com.company;

import java.sql.*;


public class AnaIslemPlatformu {

    public static void main(String[] args) throws SQLException {
        IKonsol konsol;
        konsol = new Konsol();
        IVeriTabaniSurucusu veritabani;
        veritabani = new PostgreVeriTabaniSurucusu();
        ISogutucu sogutucu;
        sogutucu = new Sogutucu();
        IAgArayuzu agArayuzu;
        agArayuzu = new AgArayuzu();
        IDurum durum;
        durum = new Durum();
        IEyleyici eyleyici;
        eyleyici = new EyleyiciBuilder(sogutucu).konsol(konsol).build();
        SicaklikCelcius sCelcius = new SicaklikCelcius();
        SicaklikKelvin sKelvin = new SicaklikKelvin();
        Publisher publisher = new Publisher();
        publisher.attach(sCelcius);
        publisher.attach(sKelvin);
        ISıcaklıkSensoru sicaklikSensoru = new SicaklikSensoru(publisher);

        boolean basari = veritabani.girisYap(konsol);
        int girilen;

        if(basari){
            agArayuzu.secenekBastir(konsol);
            while(true){

                girilen = agArayuzu.secim();
                switch (girilen){
                    case 1:
                        durum.setDurum(4);
                        konsol.Yaz(durum.getDurum());
                        eyleyici.SogutuAc();
                        durum.setDurum(1);
                        break;
                    case 2:
                        durum.setDurum(4);
                        konsol.Yaz(durum.getDurum());
                        eyleyici.SogutucuKapat();
                        durum.setDurum(1);
                        break;
                    case 3:
                        durum.setDurum(2);
                        konsol.Yaz(durum.getDurum());
                        sicaklikSensoru.Sicaklik();
                        durum.setDurum(1);
                        break;
                    case 4:
                        durum.setDurum(0);
                        konsol.Yaz(durum.getDurum());
                        System.exit(0);
                        break;
                    default:
                        konsol.Yaz("1-4 arasında bir seçim yapınız");
                        break;
                }
            }
        }
    }
}
