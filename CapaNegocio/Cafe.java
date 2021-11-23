package CapaNegocio;

public class Cafe extends Ingredientes {
    //Declaracion de atributos 
    private String color;
    private String sabor;
    //Declaracion de propiedades
    public String getColor() 
    {
        return color;
    }
    public void setColor(String color) 
    {
        this.color = color;
    }
    public String getSabor() 
    {
        return sabor;
    }
    public void setSabor(String sabor) 
    {
        this.sabor = sabor;
    }
    //Declaracion de metodos de la clase Cafe
    public String Tomar()
    {
        return "El metodo tomar no esta implementado";
    }
}
