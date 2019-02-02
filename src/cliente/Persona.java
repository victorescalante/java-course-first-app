package cliente;

import com.sun.org.apache.xml.internal.utils.StringToStringTable;

import java.util.Date;

public class Persona
{
    int id;
    String nombre;
    String apellidoPaterno;
    String appellidoMaterno;
    Date fechaDeNacimiento;
    Date fechaDeFin;

    // Method constructor
    // This method has function for initialize object
    public Persona()
    {
        id = -1;
        nombre = "No asignado";

    }

    public String toString(){
        return("Persona: "+ id + " => " + nombre);
    }
}