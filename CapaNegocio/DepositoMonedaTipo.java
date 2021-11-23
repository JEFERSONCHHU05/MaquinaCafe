package CapaNegocio;

public class DepositoMonedaTipo extends DepositoMonedas {
    
    //Declaracion de atributos
    private String denominacion;
    //Declaracion de propiedades
    public String getDenominacion() {
        return denominacion;
    }
    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
    //Declaracion de metodos de la clase DepostioMonedaTipo
    public String VerificarMoneda()
    {
        return "El metodo verificarMoneda no esta implementado";
    }
    public String DevolverMoneda()
    {
        return "El metodo devolverMoneda no esta implementado";
    }
}
