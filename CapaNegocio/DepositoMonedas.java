package CapaNegocio;

public class DepositoMonedas extends MaquinaCafe {
    
    //Declaracion de atributos
    private String numMonedas;
    private String numCambio;
    //Declaracion de propiedades
    public String getNumMonedas() 
    {
        return numMonedas;
    }
    public void setNumMonedas(String numMonedas) 
    {
        this.numMonedas = numMonedas;
    }
    public String getNumCambio() 
    {
        return numCambio;
    }
    public void setNumCambio(String numCambio) 
    {
        this.numCambio = numCambio;
    }
    //Declaracion de metodos de clase DepositoMOnedas
    public String AgregarMoneda()
    {
        return "El metodo agregarMoneda no esta implementado";
    }
    public String Contabilizar()
    {
        return "El metodo contabilizar no esta implementado";
    }
}
