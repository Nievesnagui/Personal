public class Persona {
private String nombre;
private int edad;
public Persona(String nombre, int edad){
this.nombre = nombre;
this.edad = edad;
}

public String getNombre(){
    return this.nombre;
}
publis int getEdad(){
    return this.edad;
}
public void imprimirDatos() {
System.out.println("Nombre: " + nombre);
System.out.println("Edad: " + edad);
}
}