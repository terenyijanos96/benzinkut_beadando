package model;

public class Benzinkut {

    private Jarmu[] jarmuvek_tomb;
    private boolean mukodik;
    private int jarmu_db;
    private int benzin_szint;
    private int dizel_szint;

    public Benzinkut() {
        this(6);
    }

    public Benzinkut(int max_jarmu) {
        this(new Jarmu[max_jarmu], 40_000, 40_000);
    }

    public Benzinkut(Jarmu[] jarmuvek, int benzin_szint, int dizel_szint) {
        this.jarmuvek_tomb = jarmuvek;
        this.mukodik = true;
        this.jarmu_db = 0;
        this.benzin_szint = benzin_szint;
        this.dizel_szint = dizel_szint;
    }

    public void jarmu_beall(Jarmu jarmu) {
        if (mukodik) {
            if (jarmu_db < jarmuvek_tomb.length) {
                jarmuvek_tomb[jarmu_db++] = jarmu;
                System.out.printf("J�rm� be�llt: %s: %s - %s\n", jarmu.getTulajdonos(), jarmu.getMarka().getMegnevezes(), jarmu.getModel());
            } else {
                System.out.println("A benzink�t megtelt");
            }
        } else {
            System.out.println("A benzink�t jelenleg nem m�k�dik... K�rlek n�zz vissza k�s�bb.");
        }
    }

    public void toltes(Jarmu jarmu) {
        if (bent_van_e_a_jarmu(jarmu)) {

            if (jarmu instanceof ElektromosAuto elek_aut) {
                int kapacitas = elek_aut.getAkkumulator_kapacitas();
          
                elek_aut.setToltottseg(kapacitas);
                System.out.println("�zemanyag felt�ltve!");
            } else {
                HagyomanyosAuto hagy_aut = ((HagyomanyosAuto) jarmu);
                UzemanyagTipusok tipus = hagy_aut.getUzemanyag_tipus();

                int urtartalom = hagy_aut.getUzemanyagtartaly_urtartalom();
                int szint = hagy_aut.getUzemanyag_szint();

                if (uzemanyag_levonasa(tipus, urtartalom - szint)) {
                    System.out.println("�zemanyag felt�ltve!");
                } else {
                    System.out.println("Nincs el�g �zemanyag");
                }
            }
        } else {
            System.out.println("Nincs bent a j�rm�");
        }
    }

    private boolean uzemanyag_levonasa(UzemanyagTipusok tipus, int szukseglet) {
        int maradek = -1;
        boolean valtozas = false;
        switch (tipus) {
            case BENZIN -> {
                maradek = this.benzin_szint - szukseglet;
                if (maradek >= 0) {
                    this.benzin_szint = maradek;
                }
            }
            case DIZEL -> {
                maradek = this.dizel_szint - szukseglet;
                if (maradek >= 0) {
                    this.dizel_szint = maradek;
                }
            }
        }

        return maradek >= 0;

    }

    private boolean bent_van_e_a_jarmu(Jarmu jarmu) {
        int i = 0;
        while (i < jarmu_db && jarmu != this.jarmuvek_tomb[i]) {
            i++;
        }

        return i < jarmu_db;
    }

    public Jarmu jarmu_kiall(Jarmu jarmu) {
        Jarmu vissz_ertek = null;
        int i = 0;
        while (i < jarmu_db && jarmu != jarmuvek_tomb[i]) {
            i++;
        }
        if (i < jarmu_db) {
            vissz_ertek = jarmuvek_tomb[i];
            jarmuvek_tomb[i] = null;
            System.out.printf("J�rm� ki�llt: %s: %s - %s\n", jarmu.getTulajdonos(), jarmu.getMarka().getMegnevezes(), jarmu.getModel());
        } else {
            vissz_ertek = null;
            System.out.println("J�rm� nincs bent...");
        }

        return vissz_ertek;
    }

    public boolean isMukodik() {
        return mukodik;
    }

    public void setMukodik(boolean mukodik) {
        this.mukodik = mukodik;
    }

    public int getJarmu_db() {
        return jarmu_db;
    }

    public void setJarmu_db(int jarmu_db) {
        this.jarmu_db = jarmu_db;
    }

    public int getBenzin_szint() {
        return benzin_szint;
    }

    public void setBenzin_szint(int benzin_szint) {
        this.benzin_szint = benzin_szint;
    }

    public int getDizel_szint() {
        return dizel_szint;
    }

    public void setDizel_szint(int dizel_szint) {
        this.dizel_szint = dizel_szint;
    }
    
    public void uzemanyag_raktarok_szintjenek_kiirasa(){
        System.out.printf("benzin szint: %d\ndizel szint: %d\n", getBenzin_szint(), getDizel_szint());
    }
    
    

}
