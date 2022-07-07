package Modelo;

public class FuncionTeatral {
    private ObraTeatral obraTeatral;
    private double fechaDePresentacion;
    private double duracionDePresentacion;

    public FuncionTeatral(ObraTeatral obraTeatral, double fechaDePresentacion, double duracionDePresentacion) {
        this.obraTeatral = obraTeatral;
        this.fechaDePresentacion = fechaDePresentacion;
        this.duracionDePresentacion = duracionDePresentacion;
    }

    public ObraTeatral getObraTeatral() {
        return obraTeatral;
    }

    public void setObraTeatral(ObraTeatral obraTeatral) {
        this.obraTeatral = obraTeatral;
    }

    public double getFechaDePresentacion() {
        return fechaDePresentacion;
    }

    public void setFechaDePresentacion(double fechaDePresentacion) {
        this.fechaDePresentacion = fechaDePresentacion;
    }

    public double getDuracionDePresentacion() {
        return duracionDePresentacion;
    }

    public void setDuracionDePresentacion(double duracionDePresentacion) {
        this.duracionDePresentacion = duracionDePresentacion;
    }

    @Override
    public String toString() {
        return "FuncionTeatral{" + "obraTeatral=" + obraTeatral + ", fechaDePresentacion=" + fechaDePresentacion + ", duracionDePresentacion=" + duracionDePresentacion + '}';
    }
    
    
}
