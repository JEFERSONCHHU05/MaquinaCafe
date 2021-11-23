package CapaNegocio;

public class CafeLate extends Producto {
    
    //Declaracion de atributos
    private String sabor;
    private String tamaño;
    //Declaracion de propiedades
    public String getSabor() 
    {
        return sabor;
    }
    public void setSabor(String sabor) 
    {
        this.sabor = sabor;
    }
    public String getTamaño() 
    {
        return tamaño;
    }
    public void setTamaño(String tamaño) 
    {
        this.tamaño = tamaño;
    }
    //Declaracion de metodos de la clase CafeLate
    public String Mejorar()
    {
        return "El metodo mejorar no esta implementado";
    }
}
