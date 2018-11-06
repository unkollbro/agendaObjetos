package agendaobjetos;

/**
 *
 * @author Catalin 'uNKoLL' Ciurcanu
 */
public class Persona {
    private String nombre;
    private String telefono;
    private int edad;

    public Persona(String nombre, String telefono){
        this.nombre = nombre;
        this.telefono = telefono;
        edad = 0;
    }
    
    public Persona(String nombre, String telefono, int edad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.edad = edad;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "*****************\nNombre : "+nombre+"\nTelefono : "+telefono+"\nEdad : "+edad;
    }
    
    
}
