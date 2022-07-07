package Modelo;

public class ObraTeatral {
    private String nombreObra;
    private String generoObra;
    private String resumenObra;
    private String actoresObra;
    private double precioBoletoObra;

    public ObraTeatral(String nombreObra, String generoObra, String resumenObra, String actoresObra, double precioBoletoObra) {
        this.nombreObra = nombreObra;
        this.generoObra = generoObra;
        this.resumenObra = resumenObra;
        this.actoresObra = actoresObra;
        this.precioBoletoObra = precioBoletoObra;
    }

    public String getNombreObra() {
        return nombreObra;
    }

    public void setNombreObra(String nombreObra) {
        this.nombreObra = nombreObra;
    }

    public String getGeneroObra() {
        return generoObra;
    }

    public void setGeneroObra(String generoObra) {
        this.generoObra = generoObra;
    }

    public String getResumenObra() {
        return resumenObra;
    }

    public void setResumenObra(String resumenObra) {
        this.resumenObra = resumenObra;
    }

    public String getActoresObra() {
        return actoresObra;
    }

    public void setActoresObra(String actoresObra) {
        this.actoresObra = actoresObra;
    }

    public double getPrecioBoletoObra() {
        return precioBoletoObra;
    }

    public void setPrecioBoletoObra(double precioBoletoObra) {
        this.precioBoletoObra = precioBoletoObra;
    }

    @Override
    public String toString() {
        return "Nombre Obra" + getNombreObra() + ", generoObra=" + generoObra + ", resumenObra=" + resumenObra + ", actoresObra=" + actoresObra + ", precioBoletoObra=" + precioBoletoObra + '}';
    }
    
    
}
