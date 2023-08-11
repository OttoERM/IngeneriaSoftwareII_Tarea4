public class Profesor extends Persona {
    boolean trabajaTiempoCompleto;
    public Profesor(int Id, String nombre, boolean trabajaTiempoCompleto){
        super(Id, nombre);
        this.trabajaTiempoCompleto = trabajaTiempoCompleto;
    }

    public void getTrabajaTiempoCompleto(){
        System.out.println((trabajaTiempoCompleto) ? "Si trabaja a tiempo completo":"No trabaja a tiempo completo");
    }
}
