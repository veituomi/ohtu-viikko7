package ohtu.kivipaperisakset;

import java.util.Scanner;

public abstract class KPSGeneerinen {

    protected void pelaa(Pelaaja p1, Pelaaja p2, String lause1, String lause2) {
        Tuomari tuomari = new Tuomari();

        while (true) {
            System.out.print(lause1);
            String ekanSiirto = p1.annaSiirto();

            System.out.print(lause2);
            String tokanSiirto = p2.annaSiirto();
            p2.asetaSiirto(ekanSiirto);

            if (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto)) {
                tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
                System.out.println(tuomari);
                System.out.println();
            } else {
                break;
            }
        }

        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(tuomari);
    }

    private static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }
}