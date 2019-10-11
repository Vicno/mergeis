/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomerge;

/**
 *
 * @author DIEGO
 */
public class EjemploMerge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona per = new Persona(43,"Juan","Pedro");
        System.out.println("id: "+per.id + " nombre: " + per.nombre +" apellido: " + per.apellido );
    }
    
}
