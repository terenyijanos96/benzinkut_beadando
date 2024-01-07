package main;

import model.Benzinkut;
import model.ElektromosAuto;
import model.HagyomanyosAuto;
import model.Jarmu;
import model.JarmuMarka;
import model.UzemanyagTipusok;

public class Main {

    public static void main(String[] args) {

        Benzinkut kut = new Benzinkut();

        Jarmu jarmu_1 = new HagyomanyosAuto("Zoli", JarmuMarka.FORD, "Fiesta", UzemanyagTipusok.BENZIN, 40, 35);
        Jarmu jarmu_2 = new HagyomanyosAuto("Petra", JarmuMarka.AUDI, "A4", UzemanyagTipusok.DIZEL, 58, 42);
        Jarmu jarmu_3 = new ElektromosAuto("Péter", JarmuMarka.VOLVO, "EX30", 68, 23);
        Jarmu jarmu_4 = new HagyomanyosAuto("Anikó", JarmuMarka.FORD, "Focus", UzemanyagTipusok.BENZIN, 47, 16);
        Jarmu jarmu_5 = new ElektromosAuto("Zita", JarmuMarka.AUDI, "e-tron", 50, 23);
        Jarmu jarmu_6 = new HagyomanyosAuto("Bálint", JarmuMarka.FORD, "Mondeo", UzemanyagTipusok.DIZEL, 60, 23);
        Jarmu jarmu_7 = new HagyomanyosAuto("István", JarmuMarka.AUDI, "A3", UzemanyagTipusok.BENZIN, 40, 23);

        kut.jarmu_beall(jarmu_1);
        kut.toltes(jarmu_1);
        kut.jarmu_kiall(jarmu_1);

        kut.jarmu_beall(jarmu_2);
        kut.toltes(jarmu_2);
        kut.jarmu_kiall(jarmu_2);
        
        kut.jarmu_beall(jarmu_3);
        kut.toltes(jarmu_3);
        kut.jarmu_kiall(jarmu_3);
        
        System.out.println(jarmu_1.toString());
    }
}
