package controller;

public class MainAuto {
    public static void main(String[] args) {
        AutoController ac=new AutoController();

        ac.addAuto("87987", "VW", "Passat", 120000);
        ac.addAuto("87983", "Fiat", "Sedici", 80000);
        ac.addAuto("80087", "Audi", "A4", 180000);

//System.out.printf(" %10s | %10s | %10s | %10s | %10s ", "VIN", "Marka", "Model", "Cena podstawowa", "Wyposażenie");

    }
}
