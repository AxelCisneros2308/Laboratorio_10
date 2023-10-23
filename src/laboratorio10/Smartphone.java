/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package laboratorio10;

/**
 *
 * @author cristhian.cisneros
 */
public class Smartphone implements Camara, ReproductorMusica, Internet{
    
    public String marca;
    public String modelo;
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public Smartphone(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    @Override
    public void camara(){
        System.out.println("Di queso");
    }
    
    @Override
    public void musica(){
        System.out.println("El nuevo album de badbunny esta chevere");
    }
    
    @Override
    public void internet(){
        System.out.println("Hora de jugar");
    }
    
}
