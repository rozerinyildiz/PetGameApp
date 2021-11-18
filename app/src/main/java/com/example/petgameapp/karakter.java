package com.example.petgameapp;

public class karakter {
    int kilo;
    int hareketSayisi;
    int saldiriGucu;

    public String yemek(){
        if(hareketSayisi > 0){
            kilo++;
            hareketSayisi--;
            return "Yemek yedi ve kilosu arttı.";
        }else{
            return "Yeterli hareket yok.";
        }
    }
    public String uyumak(){
        if(hareketSayisi > 0){
            hareketSayisi--;
            return "Karakterimiz uyudu.";
        }else{
            return "Yeterli hareket yok.";
        }
    }
    public String savas(){
        if (hareketSayisi > 0){
            hareketSayisi--;
            return "Karakterimiz savaştı.";
        }else {
            return "Yeterli hareket yok.";
        }
    }
    @Override
    public String toString(){
        return "Kilo: " + kilo +
        "\nHareket Sayısı:  " + hareketSayisi +
        "\nSaldırı Gücü: " + saldiriGucu ;
    }

}
