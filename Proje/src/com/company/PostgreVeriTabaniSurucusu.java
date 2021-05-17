package com.company;

import java.sql.*;
import java.util.Scanner;

public class PostgreVeriTabaniSurucusu implements IVeriTabaniSurucusu{
    @Override
    public boolean girisYap(IKonsol konsol) throws SQLException {
        String user,pass,url;
        url = "jdbc:postgresql://localhost:5432/NesneProje";
        user = "postgres";
        pass= "196196";
        Scanner girdi = new Scanner(System.in);
        Connection conn = DriverManager.getConnection( url,user,pass );
        if(conn != null){
           // System.out.println("Veritabanına bağlandı!");
            konsol.Yaz("Veritabanına bağlandı!");
        }
        else{
           // System.out.println("Bağlantı başarısız...");
            konsol.Yaz("Bağlantı başarısız...");
        }
       // System.out.print("Kullanıcı adı: ");
        konsol.Yaz("Kullanıcı adı: ");
        String kAdi = girdi.next();
       // System.out.print("Şifre : ");
        konsol.Yaz("Şifre: ");
        String sifre = girdi.next();
        String sql = "SELECT \"id\" FROM \"_User\" WHERE \"userName\"='"+kAdi+"' AND \"password\"='"+sifre+"'";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        boolean Giris = rs.next();
        rs.close();
        if (Giris == false) {
           // System.out.println("Giriş Başarısız.");
            konsol.Yaz("Giriş Başarısız.");
            return false;
        }
        else{
            //System.out.println("Giriş Başarılı!!");
            konsol.Yaz("Giriş Başarılı!!");
            String yetkiSorgu = "yetkili";
            sql = "SELECT \"id\" FROM \"_User\" WHERE \"userName\"='"+kAdi+"' AND \"yetki\"='"+yetkiSorgu+"'";
            ResultSet rs2 = stmt.executeQuery(sql);
            boolean Yetki = rs2.next();
            rs2.close();
            if(Yetki){
                konsol.Yaz("Yetki düzeyi: yetkili kullanıcı");
                return true;
            }
            else{
                konsol.Yaz("Yetki düzeyi: yetkisiz kullanıcı");
                return false;
            }
        }

    }
}
