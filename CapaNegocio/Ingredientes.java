package CapaNegocio;

public class Ingredientes extends MaquinaCafe {
    
    //Declaracion de atributos
    private String nombres;
    private String cantidad;
    //Declaracion de propiedades
    public String getNombres() 
    {
        return nombres;
    }
    public void setNombres(String nombres) 
    {
        this.nombres = nombres;
    }
    public String getCantidad() 
    {
        return cantidad;
    } 
    public void setCantidad(String cantidad) 
    {
        this.cantidad = cantidad;
    }
    //Declaracion de metodos de la clase Ingredientes
    public String Agregar()
    {
        return "El metodo agregar no esta implementado";
    }
    public String Combinar()
    {
        return "El metodo combinar no esta implementado";
    }
    
}
