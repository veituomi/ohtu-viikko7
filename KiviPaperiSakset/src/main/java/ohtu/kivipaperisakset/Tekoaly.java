package ohtu.kivipaperisakset;

public class Tekoaly implements Pelaaja {

    int siirto;

    public Tekoaly() {
        siirto = 0;
    }

    public String annaSiirto() {
        String s = seuraavaSiirto();
        System.out.println(s);
        return s;
    }

    private String seuraavaSiirto() {
        siirto = (siirto + 1) % 3;

        switch (siirto) {
            case 0:
                return "k";
            case 1:
                return "p";
            default:
                return "s";
        }
    }

    public void asetaSiirto(String ekanSiirto) {
        // ei tehdä mitään 
    }
}
