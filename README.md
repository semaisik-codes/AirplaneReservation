# AirplaneReservation

Bu proje, basit bir uçak bilet rezervasyon sistemi olarak geliştirilmiştir. Kullanıcılar uçuş bilgilerini ekleyebilir, yolcuları kaydedebilir ve uçuşlara rezervasyon yaptırabilirler. Sistem, uçakların koltuk kapasitesine göre rezervasyon kontrolü yapar ve her yolcunun yaptığı rezervasyonları yönetir.

## Airplane Sınıfı (Uçak)

Uçak ile ilgili bilgileri tutar.  
**model:** Uçağın modeli (örneğin Boeing 737 MAX)  
**brand:** Marka adı (örneğin Boeing)  
**serialNumber:** Seri numarası   

## Location Sınıfı (Lokasyon)

Uçuşun kalkış ve varış noktalarını tutar.  
**country:** Ülke  
**city:** Şehir  
**airport:** Havalimanı adı    

## Flight Sınıfı (Uçuş)

Bir uçuşu temsil eder.  
**departureLocation:** Kalkış lokasyonu  
**arrivalLocation:** Varış lokasyonu  
**airplane:** Uçakta kullanılan model  
**departureTime:** Kalkış zamanı  
**arrivalTime:** Varış zamanı  

## Reservation Sınıfı (Rezervasyon)

Yolcu bilgilerini ve rezervasyon detaylarını tutar.  
**firstName, lastName, age:** Yolcu bilgileri  
**flight:** Rezervasyon yapılan uçuş 

## Uygulama Özellikleri

Konsol üzerinden uçuş, lokasyon ve rezervasyon bilgileri girilebilir.  
Kullanıcı, istediği kalkış ve varış lokasyonlarını seçebilir, uçuş tarih ve saatini belirtebilir.
Yapılan rezervasyonlar ID numarası ile kayıt altına alınır ve listelenebilir. 

## Kullanılan Teknolojiler ve Yapılar

Java Programlama Dili  
Nesne Yönelimli Programlama (OOP)  
Collections (List yapıları): Birden fazla uçuş ve rezervasyonun saklanması için kullanıldı.
Java Time API (LocalDateTime kullanımı): Uçuş tarih ve saatlerini yönetmek için kullanıldı.  
Basit konsol arayüzü (Scanner ile kullanıcı etkileşimi): Kullanıcı ile etkileşim için kullanıldı.
Kontrol Yapıları (if-else blokları ve while döngüleri): Kullanıcı seçimlerini ve rezervasyon işlemlerini yönetmek için kullanılmıştır.  Metotlar: Tekrarlayan işlemleri fonksiyonlara bölerek kod okunabilirliğini ve tekrar kullanılabilirliği artırmak için kullanıldı.

Bu yapılar sayesinde proje modüler, anlaşılır ve kolay yönetilebilir bir yapıya kavuştu. Kullanıcı dostu, basit ama işlevsel bir uçak bileti rezervasyon sistemi ortaya çıktı.

