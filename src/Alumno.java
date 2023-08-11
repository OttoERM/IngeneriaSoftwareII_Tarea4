public class Alumno extends Persona{
    private Notas calificaciones;
    public Alumno(int Id, String nombre, Notas calificaciones){
        super(Id, nombre);
        this.calificaciones = calificaciones;
    }

    public void evaluarAlumno(){
        Notas.evaluarNotas(calificaciones);
    }
}
