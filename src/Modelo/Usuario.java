package Modelo;

public class Usuario {
    private String nombreUsuario;
    private String apellidoUsuario;
    private String curpUsuario;
    private String contraseniaUsuario;

    public Usuario(String nombreUsuario, String apellidoUsuario, String curpUsuario, String contraseniaUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.curpUsuario = curpUsuario;
        this.contraseniaUsuario = contraseniaUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public String getCurpUsuario() {
        return curpUsuario;
    }

    public void setCurpUsuario(String curpUsuario) {
        this.curpUsuario = curpUsuario;
    }

    public String getContraseniaUsuario() {
        return contraseniaUsuario;
    }

    public void setContraseniaUsuario(String contraseniaUsuario) {
        this.contraseniaUsuario = contraseniaUsuario;
    }
    
    //Falta toString
}
