import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Elso2 {
    // 1. Irassul ki az alma szót kétszer egy függvény segítségével!
    /*
    public static void main(String[] args) {
        alma();
        alma();
    }

    public static void alma() {
        System.out.println("alma");
    }
    */

    // 2. Adjunk az almáknak egy-egy mennyiséget, írassuk ki a mennyiségüket szövegesen, majd együttesen függvénnyel!

    /*
    public static void main(String[] args) {
        alma(1);
        alma(2);
        int osszeg = osszesen(1,2);
        System.out.println("Összesen " + osszeg + " alma van.");
    }

    public static void alma(int mennyi) {
        System.out.println(mennyi + " darab alma van.");
    }
    public static int osszesen(int a, int b) {
        return a+b;
    }
    */

    // 3. Olvassuk be az alma.txt fájl tartalmát, használjunk hibajelzést ha a fájl nem található!
    /*
    public static void main(String[] args) {
        File fileAlmaTxt = new File("alma.txt");
        int fileAlmaTxtTartalom = 0;

        try {
            Scanner beolvasScanner = new Scanner(fileAlmaTxt);
            fileAlmaTxtTartalom = beolvasScanner.nextInt();
            beolvasScanner.close();
        } catch (FileNotFoundException e) {
            System.out.print("Nem található ilyen fájl.");
        }

        System.out.print(fileAlmaTxtTartalom);
    }
    */

    // 4. Olvassuk be az alma.txt fájl tartalmát, majd irassuk ki a korte.txt-ben!
    /*
    public static void main(String[] args) {
        File fileAlmaTxt = new File("alma.txt");
        int fileAlmaTxtTartalom = 0;

        try {
            Scanner beolvasScanner = new Scanner(fileAlmaTxt);
            fileAlmaTxtTartalom = beolvasScanner.nextInt();
            beolvasScanner.close();
        } catch (FileNotFoundException e) {
            System.out.print("Nem található ilyen fájl.");
        }

        System.out.print(fileAlmaTxtTartalom);

        try {
            PrintWriter kiiratPrinter = new PrintWriter("korte.txt");
            kiiratPrinter.println("Az alma.txt tartama: " + fileAlmaTxtTartalom); // ez a szöveg a korte.txt-ben jelenik meg
            kiiratPrinter.close();
        } catch (FileNotFoundException e) {
            System.out.print("Nem található ilyen fájl.");
        }
    }
    */

    // 5. Olvassuk be az alma.txt számpárjait, és irassuk ki azok összegét a osszeg.txt-be!
    /*
    public static void main(String[] args) {
        File fileSzamokTxt = new File("szamok.txt");
        int sorokSzama = 5;
        int elsoSzam = 0;
        int masodikSzam = 0;
        int szamokOsszege = 0;

        try {
            Scanner beolvasScanner = new Scanner(fileSzamokTxt);
            PrintWriter szamokOsszegePrintFajl = new PrintWriter("osszeg.txt");

            for(int i=0; i<5; i++){
                elsoSzam = beolvasScanner.nextInt();
                masodikSzam = beolvasScanner.nextInt();
                szamokOsszege = osszeg(elsoSzam, masodikSzam);
                szamokOsszegePrintFajl.println(szamokOsszege);
            }

            beolvasScanner.close();
            szamokOsszegePrintFajl.close();

        } catch (FileNotFoundException e) {
            System.out.print("Nem található ilyen fájl.");
        }
    }

    public static int osszeg(int elso, int masodik){
        return elso + masodik;
    }
    */

    // 6. Írassuk ki ötször egymás alá a Hello szót többféleképpen!
    /*public static void main(String[] args) {
        int number = 0;
        while(number < 5){
            System.out.println("Hello WHILE " + number);
            number++;
        }

        int number = 0;
        while(true){ // infinite loop
            System.out.println("Hello WHILE breakkel" + number);
            if(number == 5){
                break;
            }
            number++;
        }

        for(int i =0; i<5; i++){
            System.out.println("Hello FOR " + i);
        }

        for(int i =0; i<5; i++){
            System.out.printf("Hello FOR format stringgel %d\n", i);
        }
    }*/

    // 7. Kérjünk be a felhasználó nevét, majd írjuk ki!
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add meg a neved! ");
        String input = scanner.nextLine();
        System.out.println("Szia " + input + "!");
    }*/

    // 8. Kérjük be a felhasználó magasságát, majd irassuk ki!
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hány méter a magasságod? ");
        double magassag = scanner.nextDouble();
        System.out.println("A magasságod: " + magassag + "m");
    }*/

    // 9. Kérjünk be számokat a felhasználótól, amíg nem 5-öt ad meg!
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gondoltam egy számra 1-5 között, találd ki! ");
        int szam = scanner.nextInt();

        while(szam!=5){
            System.out.println("Adj meg egy másik számot 1-5 között! ");
            szam = scanner.nextInt();
        }

        System.out.println("Eltaláltad, az 5-ösre gondoltam! WHILE");*/

        /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gondoltam egy számra 1-5 között, találd ki! ");
        int szam = scanner.nextInt();

        do{ // Egyszer biztosan lefut, mert a feltételt, csak a végén ellenőrzi!
            System.out.println("Gondoltam egy számra 1-5 között, találd ki!");
            szam = scanner.nextInt();
        }
        while(szam != 5);
        System.out.println("Eltaláltad, az 5-ösre gondoltam! DO-WHILE");
    }*/

    // 10. Switch-case-vel adjuk meg a gép állapotait kulcsszavakkal!
    /*public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Adj meg egy parancsot!");
        String text = input.nextLine();

        switch (text) {
            case "start":
                System.out.println("A gép elindult!");
                break;

            case "stop":
                System.out.println("A gép megállt!");
                break;

            default:
                System.out.println("Nem ismerem a parancsot!");
        }

        public static void main(String[] args) {

        }
    }*/
}

