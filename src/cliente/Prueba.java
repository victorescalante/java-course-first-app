package cliente;

public class Prueba {
    public static void main(String[] args){
        Persona[] arrPersonas = new Persona[5];
        System.out.println("arreglo: "+ arrPersonas[0]);
        arrPersonas[0] = new Persona();
        arrPersonas[1] = new Persona();
        arrPersonas[2] = new Persona();
        arrPersonas[3] = new Persona();
        arrPersonas[4] = new Persona();
        System.out.println("arreglo: "+ arrPersonas[0]);
        System.out.println("arreglo: "+ arrPersonas[1]);
        System.out.println("arreglo: "+ arrPersonas[2]);
        System.out.println("arreglo: "+ arrPersonas[3]);
    }
}
