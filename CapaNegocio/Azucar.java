package CapaNegocio;

public class Azucar extends Ingredientes {
    
    //Declaracion de atributos
    private String cantAzucar;
    private String tipAzucar;
    //Declaracion de propiedades
    public String getCantAzucar() {
        return cantAzucar;
    }

    public void setCantAzucar(String cantAzucar) {
        this.cantAzucar = cantAzucar;
    }

    public String getTipAzucar() {
        return tipAzucar;
    }

    public void setTipAzucar(String tipAzucar) {
        this.tipAzucar = tipAzucar;
    }
    //Declaracion de metodos de la clase Azucar
    public String Energizar()
    {
        return "El metodo energizar no esta implementado";
    }
}
