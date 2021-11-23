package CapaNegocio;

public class CafeTinto extends Producto {
    
    //Declaracion de atributos
    private String gradoAgrio;
    private String cantcafe;
    //Declaracion de propiedades
    public String getGradoAgrio() 
    {
        return gradoAgrio;
    }
    public void setGradoAgrio(String gradoAgrio) 
    {
        this.gradoAgrio = gradoAgrio;
    }
    public String getCantCafe() 
    {
        return cantcafe;
    }
    public void setCantCafe(String cantcafe) 
    {
        this.cantcafe = cantcafe;
    }
    //Declaracion de metodos de la clase CafeTinto
    public String Estimular()
    {
        return "El metodo estimular no esta implementado";
    }
}
