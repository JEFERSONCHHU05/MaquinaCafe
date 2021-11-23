package CapaNegocio;

public class MaquinaCafe {
    //Declaracion de atributos
    private String valorRecolectado;
    private String eficiencia;
    
    //Decalracion de propiedades
    public String getValorRecolectado() 
    {
        return valorRecolectado;
    }
    public void setValorRecolectado(String valorRecolectado) 
    {
        this.valorRecolectado = valorRecolectado;
    }
    public String getEficiencia() 
    {
        return eficiencia;
    }
    public void setEficiencia(String eficiencia) 
    {
        this.eficiencia = eficiencia;
    }
    //Metodos de la clase MaquinaCafe 
    public String RecibirMoneda()
    {
        return "El metodo recibirMoneda no esta implementado";
    }
    public String CancelarOperacion()
    {
        return "El metodo cancelarOperacion no esta implementado";
    }
    public String ServirProducto()
    {
        return "El metodo servirProducto no esta implementado";
    }
    public String EntregarVuelta()
    {
        return "El metodo entregarVuelta no esta implementado";
    }
}
