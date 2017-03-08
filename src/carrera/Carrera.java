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
public class Carrera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        conductor aud=new conductor("juan");
        carro competidor=new carro("audi",2014,567,aud);
        Race carrera=new Race();
        System.out.println(aud.quienmaneja);
    }
    
}
