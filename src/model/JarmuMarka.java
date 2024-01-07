package model;

public enum JarmuMarka {
    AUDI("Audi"),
    FORD("Ford"),
    VOLVO("Volvo");
    
    private final String megnevezes;

    private JarmuMarka(String megnevezes) {
        this.megnevezes = megnevezes;
    }

    public String getMegnevezes() {
        return megnevezes;
    }
    
    
    
    
}
