package com.company;

import java.text.DecimalFormat;

/**
 * Yogie Alfin Salim
 * 10117100
 * IF-3
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("====Energi Kinetik====");
        EnergiKinetik eK = new EnergiKinetik();
        eK.setMassa(145);
        eK.setKecepatan(25);
        System.out.println("Massa = "+eK.getMassa()+" g");
        System.out.println("Kecepatan = "+eK.getKecepatan()+" m/s");
        DecimalFormat df = new DecimalFormat("#.####");
        System.out.println("Energi Kinetik = "+df.format(eK.energiKinetik
                (eK.getMassa(),eK.getKecepatan()))+" joule");
        System.out.println("Usaha = "+df.format(eK.usaha
                (eK.getMassa(),eK.getKecepatan()))+" joule");
    }
}
