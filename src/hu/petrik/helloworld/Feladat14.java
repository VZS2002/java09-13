package hu.petrik.helloworld;

import java.util.Scanner;

public class Feladat14 {
    public static void main(String[] args) {

        System.out.println("Adjon meg egy szöveget!");
        Scanner sc = new Scanner(System.in);
        String szoveg = sc.nextLine();
        String valasz="";


        while(!valasz.equals("f")){
            System.out.println("Mit szeretne tenni? \n a. Nagy betűssé alakítani \n b. Kisbetűssé alakítani\n c. Lekérdezni a hosszát \n d. Összehasonlítani egy másik stringel (string2 bekérése) \n e. Egy részét kiiratni a Stringnek (a, b intervallum bekérése) \n f. Kilépni");
            valasz=sc.next();
            switch(valasz) {
                case "a":
                    szoveg=szoveg.toUpperCase();
                    System.out.println(szoveg);
                    break;
                case "b":
                    szoveg=szoveg.toLowerCase();
                    System.out.println(szoveg);
                    break;
                case "c":
                    int szam= szoveg.length();
                    System.out.println(szam);
                    break;
                case "d":

                    System.out.println("Írjon be egy másik szöveget!");
                    String szoveg2= sc.nextLine();
                    break;
                case "e":
                    System.out.println("Mettől írassa ki?");
                    int kezd = sc.nextInt();
                    System.out.println("Meddig?");
                    int veg = sc.nextInt();
        }



        }

    }
}
