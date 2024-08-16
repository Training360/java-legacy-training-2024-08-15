class: inverse, center, middle

# Munka a legacy kóddal

---

## Legacy kód fogalma

* Nagyon sok
* Nehéz megérteni
* Nehéz módosítani
* Félelem a módosítástól
* Lassú feedback a módosításról

> A kód, amit mástól kaptam. - ismeretlen

> When I say "Legacy Code" I mean valuable code you're afraid to change. - [Understand Legacy Code](https://understandlegacycode.com/)

---

## Legacy kód értéke

* Értéket termel
* Miért kell hozzányúlni?
  * Funkcionális követelmények
  * Nem funkcionális követelmények
    * Hibatűrés
    * Performancia
    * Magas rendelkezésre állás
    * Üzemeltethetőség

---

## Szabályok be nem tartása

* Nem Clean Code
  * Ugye ismered és használod a jelenlegi projektben?
  * "A forráskód a többi programozónak írja le, hogy mit akarsz a géptől."
* Nem objektumorientált
  * Ugye ismered és használod a jelenlegi projektben? (high cohesion, low coupling, S.O.L.I.D., GoF design patterns)
* Architektúra problémák
  * Architektúra nélküliség (struktúra hiánya, spagetti kód)
  * Hibásan választott architektúra
  * Architektúrák, architektúrális minták nem annyira ismertek, mint a CC vagy OO
  * Architektúra dokumentáltság hiánya (C4, UML, ADL)
  * Ugye ismered és használod a jelenlegi projektben?

---

## Szabályok be nem tartása

* Rosszul választott eszközrendszer
  * Library-k - kezelhető
  * Futtatókörnyezet, keretrendszer - még itt is vannak megoldások (platformfüggetlenség, non invasive)
  * Programozási nyelv, paradigma (functional, reactive)

---

## Hozzáállás

* A legacy kód értéket termel
* A legacy kódnak vannak felhasználói
* Mások hibáztatása: ügyféligény, időszorítás, management, más fejlesztők
  * Ügyféligények változnak
  * Versenytársak szorítása
  * Jogszabályi környezet változása
  * Szoftvernek követnie kell a változó igényeket
  * Te biztos nem fejlesztettél sosem legacy kódot? (Csak a gyíkemberek...)
  * Amit most fejlesztesz, biztos nem lesz sosem legacy kód?

---

## Motiváció

* Megértés öröme
* Új funkció létrehozásának öröme
* Egyszerűsítés (törlés) öröme
* Melyik az időtállóbb? Egy keretrendszer vagy a legacy kód kezelésének képessége?
* Nagyobb irodalma van, mint gondolnád

---

## Big bang rewrite

* Brownfield project

> If you do a big bang rewrite, the only thing you are certain of is a big bang! - Rebuilding vs. Refactoring (2003) poszt by Martin Fowler (eltűnt)

* Problémák
  * Jó emberek az új projektre - feszültség
  * Alulbecslés (idő, költség)
  * Felhasználók nem bevonása - változó felület, változó, eltűnő funkcionalitás
  * Legacy rendszerben folyamatos változtatások, amit le kell követni az új rendszerben is
  * Overengineering - [Second-System Effect](https://en.wikipedia.org/wiki/Second-system_effect) - The Mythical Man-Month by Fred Brooks (1975)
    * Felesleges absztrakció, túlbiztosítás
  * Folyamatos nyomás az új rendszerek fejlesztőin, nagy elvándorlás
  
---

## Tényleg fejlődtünk annyit?

* Jobban megismertük az ügyféligényeket?
* Fejlesztési módszertanunk fejlődött?
* CC-ban jobbak vagyunk?
* OO-ban jobbak vagyunk?
* Architektúrában, modularizációban jobbak vagyunk?
* Megjelentek új módszertanok, eszközök. Ismerjük őket?

> Ha nem tudsz monolitot írni, microservice-t sem fogsz tudni. - ismeretlen

---

## Gyakorolni, gyakorolni, <br /> gyakorolni - Code Kata

* https://understandlegacycode.com/blog/5-coding-exercises-to-practice-refactoring-legacy-code/
* [ExpenseReport](https://github.com/christianhujer/expensereport/)
* https://kata-log.rocks/
* http://codekata.com/

---

## Legacy kód kezelésének <br /> módszertana

* Sok forrás arról, hogy tartsuk tisztán a kódot
* De mi van azzal, ami már nem tiszta?
* Jó/rossz hír: pont ugyanazokat kell figyelembe venni

---

## Legacy kód kezelésének <br /> irányelvei

* Cél a folyamat visszafordítása
* Apró lépésekben (külön commitok)
* Fáj, ezért minél gyakrabban 
* Szigetek, oázisok kialakítása
* Ne told túl!
* Code review
* "Programming is the art of doing one thing at a time."
  * Flow
* Ideális állapot nem érhető el
* Ne féljünk visszalépni (revert)
* Mesélj róla másoknak (gumikacsa effektus)

---

## Félelem a módosítástól

* Félelem, hogy a módosítással mit rontunk el
  * Apró az a módosítás ahhoz képest, amennyit funkcionálisan érintetlenül akarunk hagyni
  * Hogy bizonyosodhatunk meg arról, hogy nem módosul?
* CC, OO, stb. nem óv

---

## Kockázatkezelési megoldások

* Minél kevesebb módosítás, annál kevesebb kockázat
* Nő a struktúrálatlanság
* Ha ugyanezt kell tovább módosítani, nő a kockázat, hogy elrontunk valamit
* Edit and pray
  * Nagyon nagy szaktudás szükséges
  * "Operáció vajkéssel"

---


## Tesztek fontossága

* Tesztek adják meg a biztonságot

> To me, legacy code is simply code without tests. - Working Effectively with Legacy Code by Michael C. Feathers 

* Elvek alkalmazása a légtornász, a tesztesetek a védőháló
* Unit teszt
  * Gyors feedback
  * 0,1 másodperc nagyon lassúnak számít!
* Integrációs teszt
  * Lassú
  * Nem mondja meg azonnal, hogy hol a hiba

---

## Regressziós tesztelés

* Nem hibát akarunk találni
* Biztosítani akarjuk az állandóságot
* Csak a módosítás közvetlen környezetére koncentráljunk, kis scope
* Nem csak magunknak csináljuk
* Következő fejlesztőnek is előkészítjük a terepet, ha további módosítások szükségesek
  * Lehet, hogy mi leszünk
* Gyakrabban változó kódrészleteknél hamarabb megtérül

---

## Mi akadályozza a tesztelést?

* Függőségek
* **A függőségek kezelése az egyik legkritikusabb dolog a szoftverfejlesztésben**
* Legacy rendszerekben a legnagyobb munka ezek eliminálása
* Ideális világban: példányosítás - metódushívás - assert
* Való világban: függőségek

---

## Legacy code dilemma

* Ahhoz, hogy tesztelni tudjunk változtatni kell
* De hogyan változtassunk tesztek nélkül
* Megoldás: **konzervatív refactoring eljárások elvégzése**
  * Elemi lépés (commit)

---

## Függőségek feloldása

* Test double függőségek használata
    * Dummy: nem csinál semmit (leforduljon)
    * Fake: működő implementáció, de nem éles: <br /> pl. adatbázis helyett in-memory implementáció
    * Stubs: előkészített válaszokkal rendelkezik, <br /> nem használható általánosan
    * Mock: regisztrálja, hogy milyen hívások <br /> történtek rajta, milyen paraméterekkel
* Seam: azok a pontok, ahol be tudunk avatkozni a működésbe a kód átírása nélkül
* Object seam, ezt objektum cseréjével tudjuk megtenni
* Enabling point, hogy melyik viselkedést válasszuk
* Refactoring: ilyen pontok létesítésére
  * Belső struktúra módosítása
  * Viselkedés módosítása nélkül

---

## Példa

```java
public class Mail {

    private String from;

    public Mail() {
        this.from = "info@"; // Logika a konstruktorban
    }

    public String getFrom() {
        return from;
    }
}
```

---

## Megoldás

.small-code-12[
```java
public class Mail {

    private String from;

    public Mail() {
        this.from = defaultValue();
    }

    // Refactoring: extract method
    // Object seam: be tudunk avatkozni a működésbe, override-olható metódus
    protected String defaultValue() {
        return "info@";
    }

    public String getFrom() {
        return from;
    }
}

class MailTest {

    @Test
    void testCreate() {
        // Enabling point: példányosításnál döntünk a változásról
        var mail = new Mail() {
            @Override
            public String defaultValue() {
                return "test@";  // Fake object/test double
            }
        };
        assertEquals("test@", mail.getFrom());
    }
}
```
]

---

## Dependency-Breaking Techniques

* Legjobb gyakorlatok ezekre hivatkoznak
* Hányszor hallom: "Ez egy legacy kód, erre nem lehet unit tesztet írni, mert nem úgy lett megírva."
* Könyvben 24 függőség feloldási módszer
* Mindegyikre rengeteg használati eset, példakód

.small-code-12[
```java
public class UpdateEmployeeController {

  private EmployeesService employeesService;

  public UpdateEmployeeController(EmployeesService employeesService) {
    this.employeesService = employeesService;
  }

  public String update(UpdateEmployeeCommand command) {
    employeesService.updateEmployee(command);

    // Globals
    FacesContext
      .getCurrentInstance()
      .addMessage(null, new FacesMessage("Employee has been updated"));
    FacesContext
    .getCurrentInstance()
    .getExternalContext()
    .getFlash().setKeepMessages(true);

    return "/index.xhtml?faces-redirect=true";
  }
}
```
]

---

## Jetbrains Annotations

```xml
<dependency>
    <groupId>org.jetbrains</groupId>
    <artifactId>annotations</artifactId>
    <version>24.1.0</version>
</dependency>
```

* `@TestOnly` - azt a metódust megjelölni, melyet csak tesztből lehet használni
* `@VisibleForTesting` - azt a metódust megjelölni, melynek láthatósága szűkebb is lehetne, de teszt miatt bővebb láthatósági módosítószóval van megjelölve

---

## Encapsulate global reference

.small-code-12[
```java
public class FlashMessages {

  public void addMessage(String text) {
    FacesContext
      .getCurrentInstance()
      .addMessage(null, new FacesMessage(text));
    FacesContext
      .getCurrentInstance()
      .getExternalContext()
      .getFlash().setKeepMessages(true);
  }
}
```
]

.small-code-12[
```java
public class UpdateEmployeeController {

  private FlashMessages flashMessages;

  public UpdateEmployeeController(FlashMessages flashMessages) {
    this.flashMessages = flashMessages;
  }

  public String update() {
    employeesService.updateEmployee(command);
    flashMessages.addMessage("Employee has been updated");
    return "/index.xhtml?faces-redirect=true";
  }

}
```
]

---

## Parameterize constructor

* Konstruktorban létrehozott példány cseréje
* Példány konstruktor paraméterében legyen átadva, dependency injection

---

## Parameterize method

* Metódusban létrehozott példány cseréje
* Példány metódus paraméterében legyen átadva

---

## Primitivize parameter

* Metódus bonyolult paramétereken dolgozik
* Paramétereket átkonvertálni más típusra, hogy csak a szükségesek kerüljenek átadásra

---

## Subclass and Override Method

* Függőség egy metódusát le kell cserélni
* Leszármazás és metódus felülírása

---

## Extract interface

* Függőség kiváltása
* Új interfész kiemelése, hivatkozások átírása az új interfészre
* Modularizáció
* Dependency inversion
* Kerüljük az `I` előtagot
* IDE támogatás

---

## Extract implementer

* Függőség kiváltása
* Osztály átalakítása interfésszé, implementáció áthelyezése új, más nevű osztályba
* Hasonló, mint az extract interface, különbség, hogy az eredeti átnevezésre kerül
* IDE támogatás: Extract interface - Rename original class

---

## Adapt parameter

* Konstruktor, metódus paramétere egy kiváltandó függőség
* Ez is interfészt vezet be
* Amennyiben az Extract interface nem használható
* Paraméter wrapper, paraméter burkolása másik osztályba, ami delegál
* Az osztály mockolható lesz
* Nem jó a sok metódust tartalmazó interfész, melyből csak párat használunk

---

## Break-out method object
  
* Nem példányosítható osztályban lévő metódus
* Új osztály létrehozása, konstruktorban átadjuk a paramétereket, majd paraméter nélküli metódus hívása

---

## Encapsulate global reference
  
* Statikus metódussal használt globális függőség kiváltása
* Statikus metódushívást elrejteni egy osztályba, és dependency injection, ami mockolható

---

## Introduce Instance Delegator

* Kiváltandó statikus metódusok
* Példánymetódusok létrehozása, melyek delegálnak, és a példány dependency injectionnel átadandó

---

## Introduce Static Setter

* Statikus metódus által visszaadott érték cseréje
* Új statikus setter metódus, hogy mit adjon vissza az eredeti metódus

---

## Replace Global Reference with Getter

* Statikus metódussal használt globális függőség kiváltása
* Új metódus bevezetése a függőség kiváltására, és leszármazottban mock adható vissza

---

## Expose static method

* Attribútumra nem hivatkozó metódus nem tesztelhető, mert az osztály nem példányosítható
* Legyen static

---

## Extract & override call
  
* Metódus közepén kiváltandó függőség
* Metódusba kiszervezni, leszármazottban felülírni

---

## Extract & override factory method
  
* Mint az _Extract & override call_, csak konstruktorban

---

## Pull Up Feature
  
* Osztály tele függőségekkel, de a metódusok egy részének nem kell
* Kiemelni egy absztrakt ősosztályba új névvel, és az tesztelhető

---

## Push Down Dependency
  
* Mint az előbbi, csak itt a leszármazott jön létre új névvel

---

## Javaban nem releváns Dependency-Breaking technikák

* Extract & override getter
* Definition completion
* Supersede Instance Variable
* Template Redefinition
* Text Redefinition
* Link substitution
* Replace Function with Function Pointer

---

## Mikado method

* [Use the Mikado Method to do safe changes in a complex codebase](https://understandlegacycode.com/blog/a-process-to-do-safe-changes-in-a-complex-codebase/)
* Goal: cél kitűzése
* Experiment: időkereten belül próbáljuk megoldani a problémát (10 p)
* Ha nem sikerült
  * Revert
  * Keressük meg, hogy miért nem sikerült
  * Vegyük fel új alcélnak, vizualizáljuk, folytassuk az új alcéllal
* Ha sikerült
  * Commit
  * Húzzuk ki a papíron
  * Keressünk új célt, és folytassuk azzal
* Baby steps, nincs napokon át nyúló 500 fájlos nyitott módosítás, melyet egy
  priorizált feladat miatt félbe kell hagyni
