package CapaNegocio;

public class CafeLeche extends Producto {
    
    //Declaracion de atributos
    private String cantLeche;
    private String cantCafe;
    //Declaracion de propiedades
    public String getCantLeche() 
    {
        return cantLeche;
    }
    public void setCantLeche(String cantLeche) 
    {
        this.cantLeche = cantLeche;
    }
    public String getCantCafe() 
    {
        return cantCafe;
    }
    public void setCantCafe(String cantCafe) 
    {
        this.cantCafe = cantCafe;
    }
    //Declaracion de metodos de la clase CafeLeche
    public String Agradar()
    {
        return "El metodo agradar no esta implementado";
    }
}
