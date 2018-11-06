package agendaobjetos;
/**
 *
 * @author Catalin 'uNKoLL' Ciurcanu
 */
public class AgendaObjetos {
    public static void main(String[] args) {
        Gestor gestor = new Gestor("Alfreto tu culpa es");
        //Persona[] vAgenda = new Persona[5];
        //vAgenda[0] = per1;
        //vAgenda[1] = per2;

        //for (int i=0; i<vAgenda.length;i++){
        //    if(vAgenda[i]!=null){
        //        System.out.println(vAgenda[i].toString());
        //    }
        //} 
        //System.out.println(per1.toString());
        System.out.println(gestor.mostrarTodasPersonas());
    }
    
}
