public class Persona {
private String nombre;
private int edad;
private String correo;

public Persona(String nombre, int edadd,
String correo){
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
System.out.println("Correo: " + correo);
}
}