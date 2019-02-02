package cliente;

import java.util.ArrayList;

public class Prueba {
    public static void main(String[] args){
        ArrayList<Persona> arrPersonas = new ArrayList<>();

        int num_elements = 5;

        for (int i = 0; i < num_elements; i++){
            arrPersonas.add(new Persona());
        }

        for (Persona p : arrPersonas){
            System.out.println("arreglo: "+ p);
        }

    }
}
