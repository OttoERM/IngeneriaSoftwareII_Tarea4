public class persona {
    private int Id;
    private String nombre;
    private int tipo;
    
    private static tipoPersona tipoDePersona = tipoPersona.profesor;
    private notas calificaciones;

    public persona(int Id, String nombre, String tipoPersona, int P1, int P2, int P3, int P4){
        this.Id = Id;
        this.nombre = nombre;
        calificaciones = new notas(P1, P2, P3, P4);

        if(tipoPersona.equals(tipoDePersona.tipo)){
            this.tipo = 1;
        } else {
            this.tipo = 2;
        }
    }

    public int[] obtenerNotas(){
        if(tipo != 1){
            return calificaciones.obtenerCalificaciones();
        } else {
            System.out.println("Este es tipo Profesor");
            return new int[]{0};
        }
    }
}
