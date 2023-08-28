Design patterns

•Creational Patterns

mevcut kodun yeniden kullanımını ve esnekliğin artıran nesne oluşturma mekanizmaları sunuyor
nesne oluştururken karşılaştığımız genel sorunlara çözüm üretmemize yardımcı olur

1-) Singleton pattern
bir nesneyi sadece bir classta oluşturabiliyoruz.
constructor private durumda olmalı.kullanılmasını beklemeden nesne oluşturmak problem oluşturabileceğinden Lazy loadind ile ihtiyaç duyduğumuzda oluşturup sonrasında hep aynı nesne üzerinde işlem yapmalıyız.ihtiyaç duymak = getSingleton methodunu çağırmak.
içeride nesne null ise oluştur diyerek bunu gerçekleştirebiliriz fakat bu durum sadece tek threadli durumlarda işe yarar multithread durumları için büyük sorunlar yaşamamıza sebep olabilir.thrad safe için methodun başına synchronized ifadesi ekleriz ama bu da  method her çalıştığında threadleri bekleteceğinden kodu yavaşlatır. çözüm olarak da sadece nesne null iken threadleri senkronize çalıştır demeliyiz. Null olma durumunu 2 kez kontrol etme durmumuz double checking locked olarak isimlendirilir.


2-) Factory pattern
kodu değiştirmeden genişletmenin bir yolu olarak ortaya çıkmıştır. nesneleri doğrudan kullanmak yerine interface ve nesnefactory kullanarak kodun genişletilmesini sağlıyoruz fakat çok fazla nesne bulunması çok fazla if else kullanım karmaşasına yol açıyor bunun önüne geçebilmek için abstract factory kullanımına başvuruyoruz. --bence abstract factory factory den daha karmaşık bir pattern--

telefon modelleri-telefon-telefon fabrikası- telefon bayiisi


3-) Builder pattern
karmaşık nesneleri adım adım oluşturmaya yarar. Nesneler için birden fazla constructor oluşturabiliriz fakat bu constructorların ya farklı sayıda parametreye sahip olmasını ya da farklı tipte parametre almasını bekleriz aksi durumlar için already exist yazısıyla karşılaşıyoruz. nesneyi oluştururken zorunlu olarak girilmesi gereken parametreler için de benzer sorunla karşılaşırsak bir tane nesnebuilder classı oluşturuyoruz. bu classın içine tüm attributeları verip hepsi için setlenmiş hallerini return eden fonksiyonlar oluşturuyoruz. nesnebuilder döndüren başka bir static fonksiyon oluşturarak zorunlu parametreleri veriyoruz. bir diğer fonksiyon olarak da içerisinde nesnenin tüm attributelarını set ettiğimiz bir fonksiyon oluşturup nesneyi döndürüyoruz. Sonuç olarak mainde nesnebuilder methodu içinde zorunlu parametreleri çağırıp zorunlu olmayanları set methodu ile ekleyip en son build methodunu eklersek gereksinimleri yerine getiren  istediğimiz özelliklerde bir nesne oluşturmuş oluruz. Bu pattern readability açısından da önemlidir.

ev-evbuilder-emlakçı


•Structural Patterns

Sınıfların ve nesnelerin daha büyük yapılar halinde nasıl birleştirilip verimli kullanılacağını açıklayan mekanizmalar sunuyor.

•Behavioral Patterns

Bu patternler algoritmalar ile nesneler arasındaki sorumlulukların nasıl atanacağını açıklayan mekanizmalar sunuyor.

1-) Observer pattern
nesnenin değişen durumunun diğer nesnelere otomatik haber verilmesi durumları için bu patterni kullanıyoruz. arayüzler oluşturarak bağımlılıkları azaltıp modüler bir kod yazmamızı sağlıyor. observer adında bir interface oluşturup bir update methodu tanımlyoruz.
gözlemci classı ekliyoruz nesnenin durumu değiştiğinde update edip kayıtlı gözlemcileri haberdar ediyoruz.

