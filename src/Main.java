public class Main {
    public static void main(String[] args) throws NotasException {
        Alumno alumno1 = new Alumno(125, "Pedro", new Notas(new int[]{70, 89, 59, 100}));
        alumno1.evaluarAlumno();
    }

}