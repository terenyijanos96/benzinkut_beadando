

package model;


public class ElektromosAuto extends Jarmu {
    private int akkumulator_kapacitas;
    private int toltottseg;

    public ElektromosAuto(String tulajdonos, JarmuMarka marka, String model,int akkumulator_kapacitas, int toltottseg) {
        super(tulajdonos, marka, model);
        this.akkumulator_kapacitas = akkumulator_kapacitas;
        this.toltottseg = toltottseg;
    }

    public int getAkkumulator_kapacitas() {
        return akkumulator_kapacitas;
    }

    public void setAkkumulator_kapacitas(int akkumulator_kapacitas) {
        this.akkumulator_kapacitas = akkumulator_kapacitas;
    }

    public int getToltottseg() {
        return toltottseg;
    }

    public void setToltottseg(int toltottseg) {
        this.toltottseg = toltottseg;
    }
    
    @Override
    public String toString() {
        String os_string = super.toString() + "\n";
        return os_string + "ElektromosAuto{" + "toltottseg=" + toltottseg + '}';
    }
    
    
    
}
