package communicate;

import java.io.Serializable;

public class Ogrenci implements Serializable {
    private String ogrenciAd;
    private String ogrenciSoyad;
    private String ogrenciNo;
    private String ogrenciBolum;

    public Ogrenci(String ogrenciAd, String ogrenciSoyad, String ogrenciNo, String ogrenciBolum) {
        this.ogrenciAd = ogrenciAd;
        this.ogrenciSoyad = ogrenciSoyad;
        this.ogrenciNo = ogrenciNo;
        this.ogrenciBolum = ogrenciBolum;
    }

    public String getOgrenciAd() {
        return ogrenciAd;
    }


    public void setOgrenciAd(String ogrenciAd) {
        this.ogrenciAd = ogrenciAd;
    }


    public String getOgrenciSoyad() {
        return ogrenciSoyad;
    }


    public void setOgrenciSoyad(String ogrenciSoyad) {
        this.ogrenciSoyad = ogrenciSoyad;
    }


    public String getOgrenciNo() {
        return ogrenciNo;
    }


    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public String getOgrenciBolum() {
        return ogrenciBolum;
    }

    public void setOgrenciBolum(String ogrenciBolum) {
        this.ogrenciBolum = ogrenciBolum;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ogrenciAd='" + ogrenciAd + '\'' +
                ", ogrenciSoyad='" + ogrenciSoyad + '\'' +
                ", ogrenciNo='" + ogrenciNo + '\'' +
                ", ogrenciBolum='" + ogrenciBolum + '\'' +
                '}';
    }

}