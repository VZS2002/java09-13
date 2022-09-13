package hu.petrik.helloworld;

import java.util.Locale;
import java.util.Scanner;

public class Feladat14 {
    public static void main(String[] args) {

        System.out.println("Adjon meg egy szöveget!");
        Scanner sc = new Scanner(System.in);
        String szoveg = sc.nextLine();
        String valasz = "";


        while (!valasz.equals("f")) {
            System.out.println("Mit szeretne tenni? \n a. Nagy betűssé alakítani \n b. Kisbetűssé alakítani\n c. Lekérdezni a hosszát \n d. Összehasonlítani egy másik stringel (string2 bekérése) \n e. Egy részét kiiratni a Stringnek (a, b intervallum bekérése) \n f. Kilépni");
            valasz = sc.next().toLowerCase();
            switch (valasz) {
                case "a":
                    szoveg = szoveg.toUpperCase();
                    System.out.println(szoveg);
                    break;
                case "b":
                    szoveg = szoveg.toLowerCase();
                    System.out.println(szoveg);
                    break;
                case "c":
                    int szam = szoveg.length();
                    System.out.println("A szöveg hossza: " + szam);
                    break;
                case "d":

                    System.out.println("Írjon be egy másik szöveget!");
                    String szoveg2 = sc.nextLine();
                    int hasonlit = szoveg.compareTo(szoveg2);
                    if (hasonlit < 0) {
                        System.out.println("Az első szöveg vam előrébb az ABC-ben");

                    } else if (hasonlit > 0) {
                        System.out.println("A második van előrébb az ABC-ben.");
                    } else {
                        System.out.println("A két szöveg megegyezik.");
                    }
                    break;
                case "e":
                    System.out.println("Adja meg a kezdő karakter sorszámát!");
                    int kezd = sc.nextInt();
                    System.out.println("Adja mega végső karakter sorszámát!");
                    int veg = sc.nextInt();
                    System.out.println(szoveg.substring(kezd - 1, veg - 1));
                case "f":
                    System.out.println("Viszlát");
                default:
                    System.out.println("Rossz lehetőséget adott meg, kérem adja meg újra!");
                    break;
            }


        }

    }
}
