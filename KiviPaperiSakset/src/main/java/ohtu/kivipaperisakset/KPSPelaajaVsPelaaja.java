package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSPelaajaVsPelaaja extends KPSGeneerinen implements KPSPeli {

    private static final Scanner scanner = new Scanner(System.in);

    public void pelaa() {
        super.pelaa(new Ihmisaly(scanner), new Ihmisaly(scanner), "Ensimmäisen pelaajan siirto: ", "Toisen pelaajan siirto: ");
    }
}