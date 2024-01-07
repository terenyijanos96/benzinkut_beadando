

package model;


public class HagyomanyosAuto extends Jarmu {
    private final UzemanyagTipusok uzemanyag_tipus;
    private int uzemanyagtartaly_urtartalom;
    private int uzemanyag_szint;

    public HagyomanyosAuto( String tulajdonos, JarmuMarka marka, String model, UzemanyagTipusok uzemanyag_tipus, int uzemanyagtartaly_kapacitas, int uzemanyag_szint) {
        super(tulajdonos, marka, model);
        this.uzemanyag_tipus = uzemanyag_tipus;
        this.uzemanyagtartaly_urtartalom = uzemanyagtartaly_kapacitas;
        this.uzemanyag_szint = uzemanyag_szint;
    }

    public UzemanyagTipusok getUzemanyag_tipus() {
        return uzemanyag_tipus;
    }

    public int getUzemanyagtartaly_urtartalom() {
        return uzemanyagtartaly_urtartalom;
    }

    public void setUzemanyagtartaly_urtartalom(int uzemanyagtartaly_urtartalom) {
        this.uzemanyagtartaly_urtartalom = uzemanyagtartaly_urtartalom;
    }

    public int getUzemanyag_szint() {
        return uzemanyag_szint;
    }

    public void setUzemanyag_szint(int uzemanyag_szint) {
        this.uzemanyag_szint = uzemanyag_szint;
    }

    @Override
    public String toString() {
        String os_string = super.toString() + "\n";
        return os_string + "HagyomanyosAuto{" + "uzemanyag_tipus=" + uzemanyag_tipus + ", uzemanyagtartaly_kapacitas=" + uzemanyagtartaly_urtartalom + ", uzemanyag_szint=" + uzemanyag_szint + '}';
    }

    
    
    
    
}
