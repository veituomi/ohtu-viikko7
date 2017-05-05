package ohtu.kivipaperisakset;

import java.util.Scanner;

public abstract class KPSGeneerinen {

    protected void pelaa(Pelaaja p1, Pelaaja p2, String lause1, String lause2) {
        Tuomari tuomari = new Tuomari();

        System.out.print(lause1);
        String ekanSiirto = p1.annaSiirto();

        System.out.print(lause2);
        String tokanSiirto = p2.annaSiirto();

        while (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto)) {
            tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
            System.out.println(tuomari);
            System.out.println();

            System.out.print(lause1);
            ekanSiirto = p1.annaSiirto();
            p1.asetaSiirto(tokanSiirto);

            System.out.print(lause2);
            tokanSiirto = p2.annaSiirto();
            p2.asetaSiirto(ekanSiirto);

        }

        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(tuomari);
    }

    private static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }
}