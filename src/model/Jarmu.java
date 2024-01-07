

package model;


public abstract class Jarmu {
    private String tulajdonos;
    private JarmuMarka marka;
    private String model;

    public Jarmu(String tulajdonos, JarmuMarka marka, String model) {
        this.tulajdonos = tulajdonos;
        this.marka = marka;
        this.model = model;
    }

    public String getTulajdonos() {
        return tulajdonos;
    }

    public void setTulajdonos(String tulajdonos) {
        this.tulajdonos = tulajdonos;
    }

    public JarmuMarka getMarka() {
        return marka;
    }

    public void setMarka(JarmuMarka marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Jarmu{" + "tulajdonos=" + tulajdonos + ", marka=" + marka + ", model=" + model + '}';
    }
    
    
    
    
    
    
}
