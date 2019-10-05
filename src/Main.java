public class Main {

    public static void main(String[] args) {

        System.out.println("Programozás alapok Udemy kurzus");

        // 1. Írassuk egy egy int és egy string adattípus értékét!
        /*
        int x = 3;
        x = x++;

        String szoveg = "alma";
        System.out.println(x);
        System.out.println(szoveg);

        if(x == 5) {
            System.out.println("Az értéke 5.");
        }
        else {
            System.out.println("Az értéke nem 5.");
        }

        for (int i=0; i<10; i++) {
            System.out.print(i);
            if(i<9) {
                System.out.print(',');
            } else {
                System.out.println();
            }
        }
        */

        // 2. Irassuk ki 0-100-ig a 7-tel osztható számokat!
        /*
        for(int szam=1; szam<100; szam++) {
            if(szam%7==0) {
                System.out.println(szam + " osztható 7-tel.");
            }
        }
        */

        // 3. Irassuk ki 0-100-ig a 7-tel osztható számok számát!
        /*
        int[] lista = new int[50];
        int szamlalo = 0;

        for(int i=0; i<100; i++) {
            if(i%7==0) {
                lista[szamlalo] = i;
                szamlalo = szamlalo +1;
            }
        }
        System.out.println(szamlalo + " db 7-tel osztható szám van 0-100-ig");
        */

        // 4. Kérjünk be egy számlistát, és adjuk vissza a számok összegét!
        /*
        int[] lista = {5, 12, 4, 6, 3, 7, 15, 9, 2};

        int szamlalo = lista.length;
        System.out.println(szamlalo);

        int osszeg = 0;
        for(int i=0; i < lista.length; i++) {
            osszeg = osszeg + lista[i];
        }
        System.out.println(osszeg + " a lista összege.");
        */

        // 5. Kérjünk be egy számlistát, és adjuk vissza a páratlan számainak számát.
        /*
        int[] lista = {5, 12, 4, 6, 3, 7, 15, 9, 2};

        int szamlalo = lista.length;
        System.out.println(szamlalo);

        int osszeg = 0;
        for(int i=0; i < lista.length; i = i+1) {
            osszeg = osszeg + lista[i];
        }

        System.out.println(osszeg + " a lista osszege.");

        int darab = 0;
        for(int i = 0; i<lista.length; i++) {
            if(lista[i]%2 == 1) {
                darab = darab + 1;
            }
        }

        System.out.println(darab + " darab páratlan szám van.");
        */

        // 6. Irassuk ki, hogy egy adott szám szerepel-e a listában!
        /*
        int[] lista = {5, 12, 4, 6, 3, 7, 15, 9, 2};

        int szamlalo = lista.length;
        System.out.println(szamlalo);

        int osszeg = 0;
        for(int i=0; i < lista.length; i = i+1) {
            osszeg = osszeg + lista[i];
        }

        System.out.println();

        int ki = 11;
        boolean van = false;
        for(int i=0; i<lista.length; i++) {
            if(lista[i] == ki) {
                van = true;
            }
        }
        if(van) {
            System.out.println(ki + " szerepel a listában.");
        } else {
            System.out.println(ki + " nem szerepel a listában.");
        }*/

        // 7. Irassuk ki egy adott elem helyét a listában!
        /*
        int[] lista = {5, 12, 4, 6, 3, 7, 15, 9, 2};
        int mi = 6;
        int hol = -1;

        for(int i=0; i<lista.length; i++) {
            if(lista[i] == mi) {
                hol = 1;
            }
        }
        System.out.println("A " + mi + " elem a listában van itt: " + hol);
        */

        // 8. Ha egy elem a listában van, irassuk ki a helyét!
        /*
        int[] lista = {5, 12, 4, 6, 3, 7, 15, 9, 2};

        int ezt = 15;
        int holvan = -1;
        for(int i=0; i<lista.length; i++) {
            if(lista[i] == ezt) {
                holvan = i + 1;
            }
        }
        if(holvan == -1) {
            System.out.println(ezt + " elem nincs a lsitában");
        } else {
            System.out.print(ezt + " elem itt van: " + holvan);
        }
        */

        // 9. Irassuk ki a listából a legnagyobb számot és a helyét!
        /*
        int[] lista = {5, 12, 4, 6, 3, 7, 15, 9, 2};
         /*
        int maximumErtek = -1;
        int maximumHely = -1;

        for(int i=0; i<lista.length; i++) {
            if(lista[i]>maximumErtek) {
                maximumErtek = lista[i];
                maximumHely = i + 1;
            }
        }
        System.out.println("A lista maximuma: " + maximumErtek + " a(z) " + maximumHely + ". helyen.");
        */

        // 10. A lista tartalmát másoljuk át, duplázzuk, és irassuk ki a 10-nél nagyobb elemeit!
        /*
        int[] lista = {5, 12, 4, 6, 3, 7, 15, 9, 2};

        int[] lista2 = new int[20]; // létrehozok egy maximum 20 elemű új listát (konstans, nem kötelező konstansnak lennie)
        int szamlalo2 = 0; // az új lista számlálójának kezdeti értéke 0

        for(int i=0; i<lista.length; i++) { // a másoláshoz a lista1-et használom, mert annak tudom a hosszát, a lista2-ét még nem
            lista2[szamlalo2] = 2*lista[i]; // a második lista soron következő elemének meg kell egyeznie a lista i-edik elemével (sima másolás)
            szamlalo2++; // megszámoljuk a második lista elemeit is
        }

        int szamlalo = lista.length;
        int[] rendezettLista = new int[szamlalo]; // a harmadik lista elemszáma megegyezik a korábbi listák elemszámával (nem konstans)
        int szamlalo3 = 0;
        for(int i=0; i<szamlalo2; i++) {
            if(lista2[i]>10) { // a második lista 2-vel szorzott elemei közül csak a 10-nél nagyobbakat rakjuk a rendezett listába
                rendezettLista[szamlalo3] = lista2[i];
                szamlalo3++;
            }
        }
        for(int i=0; i<szamlalo3; i++) {
            System.out.print(rendezettLista[i]);
            System.out.print(", ");
        }
        */

        // 11. Rendezzük növekvő sorrendbe a lista elemit! (buborék - nem gyors, de egyszerű > végigmegy a tömbön és a legkisebb elemet választja)

        /*
        int[] lista = {5, 12, 4, 6, 3, 7, 15, 9, 2};

        for (int i=0; i<lista.length-1; i++) {          // végigmegy a listán az utolsó előtti elemig
            for (int j = i+1; j<lista.length; j++) {    // csak az i+1-től megy végig a még nem rendezett elemeken
                if(lista[i]>lista[j]) {
                    int temp = lista[i];
                    lista[i] = lista[j];
                    lista[j] = temp;
                }
            }
        }

        for(int i=0; i<lista.length;i++) {
            System.out.print(lista[i]);
            System.out.print(", ");
        }
        */

    }
}


