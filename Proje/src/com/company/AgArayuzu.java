package com.company;

import java.util.Scanner;

public class AgArayuzu implements IAgArayuzu{
    Scanner girdi = new Scanner(System.in);

    public void secenekBastir(IKonsol konsol) {
        konsol.Yaz("Yapmak istediğiniz işlemi seçiniz");
        konsol.Yaz("1-Soğutucuyu aç");
        konsol.Yaz("2-Soğutucuyu kapat");
        konsol.Yaz("3-Sıcaklık görüntüle");
        konsol.Yaz("4-Çıkış");
    }


    public int secim() {

        int girilen;
        girilen = girdi.nextInt();
        return girilen;
    }
}
