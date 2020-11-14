# client-server-communicate

* Sistemimizde 3 adet .java dosyamız var. Bunlardan ikisi processimiz. Bunlar P1.java, P2.java.

* Ogrenci.java dosyamızda ogrenciNo, ogrenciAd, ogrenciSoyad, ogrenciBolum alanları (hepsi String olabilir) ve toString() metodları yer almaktadir.

* P1 processi Ogrenci sınıfından her alanı dolu sadece adı Ayşe olan bir nesne oluşturarak P2’ye bu mesajı nesne olarak soketler aracılığı ile gönderiyor.

* P2 de P1’den aldığı nesnenin toString() ile ekranda her alanını listeleyip, adını Ali olarak karşı tarafa (P1’e soket kullanarak) gönderiyor.

* P1 aldıktan sonra yeni nesneyi ekrana yazdırdıktan sonra uygulamalar sonlandırılır.
