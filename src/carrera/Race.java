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
public class Race {
    private carro carro;

    public Race(carro carro) {
        this.carro = carro;
    }

    public carro getCarro() {
        return carro;
    }

    public void setCarro(carro carro) {
        this.carro = carro;
    }
    
}
