 # Progmod II beadandó

 >Italdiszkont-felhasználók és termékek tárolása/menedzselésére szolgáló api.

 ## Telepítési útmutató
 > - PostgreSQL - version:
 > - Java - version: 17
 > - SpringBoot - modelVersion: 4.0.0 

 ## Müködése
 > - Keresőmező - Kulcsszó alapján keresés az adatbázisban get metódussal
 > - Product - Get metódus hívással lekérjük az összes terméket az adatbázisból
             - Post új termék felvétele adatbázisba
             - Delete termék törlése az adatbázisból
             - Put termmék frissítése az adatbázisban
 > - User - Post metódussal új felhasználó felvétele 
          - Get metódus id alapján lekéri a felhasználót
          - Delete id alapján felhasználó törlése az adatbázisból
          - Put id alapján a felhasználó frissítése az adatbázisban
 
 ## Controller
 > Product controller: path = "product"  
 > - Get - összes termék lekérdezése
 > - Post - új termék hozzá adása - required data: String name, String description - optional, Integer price, String imageSrc - optional, ProductType Type, Boolean hero - Default(false), Integer size, Integer alcoholPercent, String placeOfOrigin - optional 
 > - Delete - Termék törlése id alapján
 > - Put - Termék módosítása id alapján
 
 > User controller: path = "user"
 > - Get - Felhasználó lekérdezése id alapján
 > -Post - Új felhasználó felvétele az adatbázisba. required data: String name, String phoneNumber - optional, String email, String zip - optional, String city - optional, String street - optional, String cart - optional
 > - Delete - Felhasználó törlése id alapján
 > - Put - Felhasználó frissítése id alapján

 > SearchBar controller - 
 > - Get - required data: String keyword
  
 ## Model
 > Product model: Integer id - GeneratedValue(strategy = GenerationType.IDENTITY), String name, String description, Integer price, String imageSrc, ProductType Type, Boolean hero - Default(false), Integer size, Integer alcoholPercent, String placeOfOrigin
 > User model: Integer id - GeneratedValue(strategy = GenerationType.IDENTITY), String name, String phoneNumber, String email, String zip, String city, String street, String cart
 > ProductType (model): ENUM {BEER, WINE, WHISKEY, GIN, SNAPS}
 

 ## Repository
 > ProductRepository - JpaRepository<Product, Integer>
 > - Method: List<Product> findByKeyword(String keyword)
 > UserRepository - JpaRepository<User, Integer> 
 
 ## Service
 >ProductService - findByKeyword(String keyword)
                 - findAll()
                 - deleteById(Integer id)
                 - saveById(Integer id, Product product)
                 - save(Product product)
 >UserService    - findById(Integer id)
                 - deleteById(Integer id)
                 - saveById(Integer id, Product product)
                 - save(Product product)
 ## Tetszelés
Postmannel tesztelve. A bemeneteknek tartalmaznia kell a következő adatokat:
>  - POST: name, email, number, age, address
>  - GET: name
>  - DELETE: id  
>  - PUT: ID, name, email, number, age, address (az ID-t em lehet megváltoztatni)
  
