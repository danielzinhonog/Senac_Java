import java.util.Scanner

public class Carros {

    protected String marca;
    private String modelo;

    public Carros(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String marca){
        this.modelo = modelo;
    }
}