/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrera;

/**
 *
 * @author Estudiante
 */
public class carro {
    private String marca;
    private int modelo;
    private int placa;
    private conductor conductor;

    public carro(String marca, int modelo, int placa, conductor conductor) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.conductor=conductor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public conductor getConductor() {
        return conductor;
    }

    public void setConductor(conductor conductor) {
        this.conductor = conductor;
    }
    
    public void quienmaneja(){
        conductor.getNombre();
    }
}
