package ohtu.kivipaperisakset;

import java.util.Scanner;

public class Ihmisaly implements Pelaaja {

    private Scanner scanner;

    public Ihmisaly(Scanner scanner) {
        this.scanner = scanner;
    }

    public String annaSiirto() {
        return scanner.nextLine();
    }

    public void asetaSiirto(String ekanSiirto) {
        // ei tehdä mitään 
    }
}
