package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSTekoaly extends KPSGeneerinen {

    private static final Scanner scanner = new Scanner(System.in);

    public void pelaa() {
        super.pelaa(new Ihmisaly(scanner), new Tekoaly(), "Ensimmäisen pelaajan siirto: ", "Tietokone valitsi: ");
    }
}