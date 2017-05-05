package ohtu.kivipaperisakset;

public class Pelitehdas {

    public static KPSPeli luo(String vastaus) {
        if (vastaus.endsWith("a")) {
            return new KPSPelaajaVsPelaaja();
        } else if (vastaus.endsWith("b")) {
            return new KPSTekoaly();
        } else if (vastaus.endsWith("c")) {
            return new KPSParempiTekoaly();
        }
        return null;
    }
}