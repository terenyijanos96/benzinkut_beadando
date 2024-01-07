package model;

public enum UzemanyagTipusok {
    BENZIN("benzin"),
    DIZEL("dízel");

    private final String megnevezes;

    private UzemanyagTipusok(String megnevezes) {
        this.megnevezes = megnevezes;
    }

    public String getMegnevezes() {
        return megnevezes;
    }

}
