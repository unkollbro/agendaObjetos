package agendaobjetos;

public class Gestor {
    private String nombre;
    private Persona[] vAgenda; 

    public Gestor(String nombre) {
        this.nombre = nombre;
        this.vAgenda = new Persona[10];
        vAgenda[0]=new Persona("Catalin", "123456");
        vAgenda[1]=new Persona("uNKoLL", "231321", 312);
    }
    
    public String mostrarTodasPersonas(){
        String datos = null;
        
        return datos;
    }
}
