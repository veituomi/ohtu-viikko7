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

            p1.asetaSiirto(tokanSiirto);
            p2.asetaSiirto(ekanSiirto);

            if (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto)) {
                tuomaroi(tuomari, ekanSiirto, tokanSiirto);
            } else {
                break;
            }
        }

        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(tuomari);
    }

    private void tuomaroi(Tuomari tuomari, String ekanSiirto, String tokanSiirto) {
        tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
        System.out.println(tuomari);
        System.out.println();
    }

    private static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }
}