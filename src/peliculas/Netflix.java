/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peliculas;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author docentes.horat
 */
public class Netflix {
    
    private ArrayList<Pelicula> listaPelicula = new ArrayList<>();

    public Netflix() {
    }
    
    public void agregarPelicula(Pelicula p){
        listaPelicula.add(p);
    }
    
    public void eliminarPelicula(Pelicula p){
        listaPelicula.remove(p);
    }
    
    public void mostrarLista(){
        Iterator<Pelicula> elemento = listaPelicula.iterator();
        while(elemento.hasNext()){
            Pelicula p = elemento.next();
            System.out.println(p.toString());
        }
    }
}
