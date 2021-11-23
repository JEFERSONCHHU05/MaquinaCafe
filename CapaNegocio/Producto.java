package CapaNegocio;

public class Producto extends MaquinaCafe {
    
    //Declaracion de atributos
    private String nombres;
    private String costo;
    //Declaracion de propiedades
    public String getNombres() 
    {
        return nombres;
    }
    public void setNombres(String nombres) 
    {
        this.nombres = nombres;
    }
    public String getCosto() 
    {
        return costo;
    }
    public void setCosto(String costo) 
    {
        this.costo = costo;
    }
    //Metodos de la clase Producto
    public String Vender()
    {
        return "El vender vender no esta implementado";
    }
    public String Degustar()
    {
        return "El metodo degustar no esta implementado";
    }
}
