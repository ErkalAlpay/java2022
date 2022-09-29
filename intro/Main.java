package intro;

public class Main {
    
    public static void main(String[] args) {

        /* 
        char grade = 'A';
        
        switch (grade) {
            case 'A': System.out.println("AA");
                
                break;
            case 'B': System.out.println("BB");
                break;

            case 'C': System.out.println("CC");
                break;

            default: System.out.println("Yalnış Not Girdiniz");
                break;
        }

        */

        /* 
        int j = 1;
        do{ j++;

            System.out.println("j = "+ j);
        }
        while(j<10); {
            System.out.println("Döndü bitti");
        
        } */
        

        /* 
        String ogrenci1 = "Ahmet";
        String ogrenci2 = "Mehmet";
        String ogrenci3 = "Efe";

        String[] ogrenci = new String[3];

        ogrenci[0] = "Ahmet";
        ogrenci[1] = "Mehmet";
        ogrenci[2] = "Efe";

        for (int i = 0; i < ogrenci.length; i++) {
            System.out.println(ogrenci[i]);
            
        }

        for (String ogrenciler:ogrenci){
            System.out.println(ogrenciler);

        }

        */
        

        /* 
        double[] myList = {1.2,1.5,3.4,2.8};
        double total=0;
        double max= myList[0];

        for(double number:myList){
            if(max<number){
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }
        System.out.println("Dizideki en büyük sayı = " + max);
        System.out.println("Toplam = " + total);

        */



        /* 

        String mesaj = "Bugün hava çok güzel";
        System.out.println(mesaj);

        System.out.println("Eleman Sayısı : " + mesaj.length());
        System.out.println("Beşinci Eleman : "+ mesaj.charAt(4)); // 'charAt' komutu yazıdaki harfleri seçebilmemizi sağlar.

        System.out.println(mesaj.concat( " değil mi ?")); // 'concat' mesaja ekleme yapar.

        System.out.println(mesaj.startsWith("B")); //Ne ile başladığını kontrol eder ve boolean değer döndürür.

        System.out.println(mesaj.endsWith("l"));//Ne ile bittiğini kontrol eder ve boolean döndürür.

        System.out.println(mesaj.indexOf('a'));//Metinde bulduğu ilk a nın yerini yazdırır(boşlukta sayılır)

        System.out.println(mesaj.indexOf("gü"));//Sadece harf değil kelime de hece de aratabilirsin.

        System.out.println(mesaj.lastIndexOf('a'));//Bu sefer aramaya sağdan başlar.

        System.out.println(mesaj.replace('B', 'b'));//harf değiştirmeye yarar. Fakat kalıcı değişmez

        System.out.println("---------------------");

        System.out.println(mesaj);

        System.out.println("-------------------");

        String yeniMesaj = mesaj.replace('B', 'b');//bu şekil yeni bir değişkene atayabiliriz

        System.out.println(yeniMesaj);    
    
        System.out.println(mesaj.substring(5));//5. karakterden sonraki kısmı alır.
        
        System.out.println(mesaj. substring(5, 7)); //5 den başla 7 ye kadar kes. (5 ve 7 dahil olmuyor)
        
        for(String kelime:mesaj.split(" ")){ // split komutu kelime kelime ayırır cümleyi
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase()); //harfleri küçük yazar
        System.out.println(mesaj.toUpperCase()); //harfleri büyük yazar
        System.out.println(mesaj.trim()); // eğer ki başında ve sonunda boşluk var ise onları keser. "  merhaba   " gibi "merhaba"

        */


        //Asal sayı hesaplama

        int number = 25;
        



    }
    
}
