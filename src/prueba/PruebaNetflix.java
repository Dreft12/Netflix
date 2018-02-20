/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import peliculas.Netflix;
import peliculas.Pelicula;

/**
 *
 * @author docentes.horat
 */
public class PruebaNetflix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pelicula p1 = new Pelicula(1, "Jumanji", 120, "Ficcion");
        Pelicula p2 = new Pelicula(2, "Pantera negra", 160, "Ficcion");
        Pelicula p3 = new Pelicula(3, "Los increibles 2", 130, "Animada");
        Netflix n = new Netflix();
        n.agregarPelicula(p1);
        n.agregarPelicula(p2);
        n.agregarPelicula(p3);
        n.mostrarLista();
        System.out.println("------------");
        n.eliminarPelicula(p3);
        n.mostrarLista();
        System.out.println("La pelicula: "+ p1.getNombre() + 
                " tiene una duracion de: "+ p1.getDuracion()+ 
                " minutos.");
        p1.setDuracion(180);
        System.out.println("-----------");
        System.out.println("La pelicula: "+ p1.getNombre() + 
                " tiene una duracion de: "+ p1.getDuracion()+ 
                " minutos.");
        n.mostrarLista();
    }
    
}
