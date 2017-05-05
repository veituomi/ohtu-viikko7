package ohtu.kivipaperisakset;

import java.util.Scanner;

// Kivi-Paperi-Sakset, jossa voidaan valita pelataanko vastustajaa
// vastaan vai ei
public class KPSParempiTekoaly extends KPSGeneerinen {

    private static final Scanner scanner = new Scanner(System.in);

    public void pelaa() {
        super.pelaa(new Ihmisaly(scanner), new TekoalyParannettu(20), "Ensimmäisen pelaajan siirto: ", "Tietokone valitsi: ");
    }
}