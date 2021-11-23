package CapaNegocio;

public class Cacao extends Ingredientes {
    
    //Declaracion de atributos
    private String cantCacao;
    private String procedencia;
    //Declaracion de propiedades

    public String getCantCacao() {
        return cantCacao;
    }

    public void setCantCacao(String cantCacao) {
        this.cantCacao = cantCacao;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }
    //Declaracion de metodos de la clase Cacao
    public String Moler()
    {
        return "El metodo moler no esta implementado"; 
    }
}
