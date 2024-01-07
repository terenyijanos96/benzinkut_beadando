Készítette: Terényi János

# Java benzinkút beadandó feladat

A program egy képzeletbeli benzinkút működését modellezi.
BEnzinkút: 
A benzinkúton kétféle járművet lehet feltölteni: elektromos és "hagyományos" autókat (benzin, dízel). Mindkét típus a jármű absztrakt osztályának gyermekei.

A jármű osztály tulajdonságai közé tartozik a tulajdonos neve (String), a márka (enum), a modell (String), amelyeket minden gyermek osztály örököl. A gyermek osztályok a toString metódust felülírják, hozzátéve saját adattagjaikat.

Az elektromos járművek jellemzői közé tartozik az akkumulátor kapacitása (integer), valamint annak töltöttsége, amit kWh-ban fejezünk ki. A hagyományos üzemanyagú autók jellemző adattagjai az üzemanyagtípus (enum), (jelenleg benzin, vagy dízel), valamint az üzemanyag űrtartalma (integer), amely literenkénti üzemanyagot jelent.

A járművek töltésekor (benzinkút "tolt" metódusa) a jármű gyermekosztályainak a megfelelő metódsait hívjuk meg, hogy az elektromos autóknak az akkumulátora, a hagyományos autóknak az üzemanyag tartálya töltődjön meg.

A benzinkúton alapértelmezés szerint hat jármű tartózkodhat egyszerre, ezeket a járműveket tömb struktúrában tároljuk. A Benzinkut osztály "jarmu_beall" metódusával lehet felvenni járműveket, míg a "jarmu_kiall" metódussal lehet kivenni a tömbből. A tömb jelenleg nincs rendezve vagy optimalizálva, az új autókat a tömb "jarmu_db" indexű helyére helyezzük el.

A program fő metódusa a main package "Program" osztályában található. Itt példányosítjuk a Benzinkút osztályt, valamint az összes Jármű gyermek osztályt (ElektromosAuto, HagyomanyosAuto), és itt hívjuk meg a Benzinkút osztály metódusait is.

A benzinkút osztály példányosításakor három különböző konstruktort definiáltam, amelyek egymást rekurzívan hívják, ezzel egymás adattagjait egészítik ki.

