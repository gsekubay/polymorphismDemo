package JavaSortExample;

import JavaSortExample.Kunden;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Kunden ersteKunden = new Kunden();
        ersteKunden.setKundenId(1);
        ersteKunden.setKundenVorname("Gülsah");
        ersteKunden.setKundenNachname("Sekübay");

        Kunden zweiteKunden = new Kunden();
        zweiteKunden.setKundenId(2);
        zweiteKunden.setKundenVorname("Büsra");
        zweiteKunden.setKundenNachname("Aktas");

        Kunden dritteKunden = new Kunden();
        dritteKunden.setKundenId(3);
        dritteKunden.setKundenVorname("Gülsah");
        dritteKunden.setKundenNachname("Akts");

        Kunden vierteKunden = new Kunden();
        vierteKunden.setKundenId(4);
        vierteKunden.setKundenVorname("Nuray");
        vierteKunden.setKundenNachname("Sekübay");


        ArrayList kundenList = new ArrayList();
        kundenList.add(ersteKunden);
        kundenList.add(zweiteKunden);
        kundenList.add(vierteKunden);
        kundenList.add(dritteKunden);


        kundenSortieren(kundenList);
        //kundenSortierenMitStream(kundenList);

        for (int i = 0; i < kundenList.size(); i++) {
            Kunden kundenList1 = (Kunden) kundenList.get(i);
            System.out.println("\n" + kundenList1.getKundenVorname().toString() + " " + kundenList1.getKundenNachname());

        }
    }

    /*
        Ascending sort for Surname
     */
    public static ArrayList kundenSortieren(ArrayList kundenList) {
        Kunden kunden1 = null;
        Kunden kunden2 = null;
        Kunden tempKunden = null;
        for (int i = 0; i < kundenList.size(); i++) {

            for (int j = 1; j < kundenList.size(); j++) {

                kunden1 = (Kunden) kundenList.get(j - 1);
                kunden2 = (Kunden) kundenList.get(j);


                if (kunden1.getKundenNachname().compareTo(kunden2.getKundenNachname()) > 0) {

                    // tempKunden = (JavaSortExample.Kunden) kundenList.get(j-1);
                    kundenList.set(j - 1, kunden2);
                    kundenList.set(j, kunden1);

                } else if (kunden1.getKundenNachname().compareTo(kunden2.getKundenNachname()) == 0) {

                    if (kunden1.getKundenVorname().compareTo(kunden2.getKundenVorname()) > 0) {

                        // tempKunden = (JavaSortExample.Kunden) kundenList.get(j-1);
                        kundenList.set(j - 1, kunden2);
                        kundenList.set(j, kunden1);


                    }

                }

            }

        }

        return kundenList;


    }




    public static void kundenSortierenMitStream(List kundenList) {


        Kunden k1 = (Kunden) kundenList.get(0);
        Kunden k2 = (Kunden) kundenList.get(1);


        kundenList.stream().sorted((p1, p2) -> {
            return ((k2.getKundenNachname()).compareTo(k1.getKundenNachname()));
            //});
            //  kundenList.stream().sorted(Comparator.comparing(JavaSortExample.Kunden::getKundenNachname)).forEach(kunden -> System.out.println(kunden.toString()));
            //kundenList.stream().sorted(Comparator.comparingLong(JavaSortExample.Kunden::getKundenNachname)).forEach(person -> System.out.println(person.getClass()));
            //kundenList.stream().sorted(Comparator.comparing(JavaSortExample.Kunden::getKundenNachname).thenComparing(JavaSortExample.Kunden::getKundenVorname)).forEach(person -> System.out.println(person.toString())); //Sorting by person id and then by age.

            // return (ArrayList) kundenList;


        });


    }
}






