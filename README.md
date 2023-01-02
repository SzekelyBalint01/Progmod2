 # Progmod II beadandó

>Emberek számontartása a cél a következő adatokat tárolva: név, email, telefonszám, kor, lakcím és minden felvett embernek generál egy ID-t.

 ## Müködése
>Az sql adatbázissal a következő metódusokkal lehet komunikálni:
> - Post - Új felvétel
> - Get - Egy elemet kiolvas
> - Delete - Törlés
> - Put - Modosítás

 ## Controller
>Post get delete és a update helye.

 ## Model
>USER felépítése id kijelölése és automatikus generálása getterek setterek helye.

 ## Repo
>Repositori létrehozása (extends JPA repositori)

 ## Service
>Post get delete és put álltal használt fügvények ebben a részben vannak.

 ## Tetszelés
Postmannel teszteltem a metódusokat. a bemeneteknek tartalmaznia kell a következő adatokat:
>  - POST: name, email, number, age, address
>  - GET: name
>  - DELETE: id  
>  - PUT: ID, name, email, number, age, address (az ID-t em lehet megváltoztatni)
  
