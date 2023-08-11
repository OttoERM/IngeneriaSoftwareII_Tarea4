public class notas {
    int[] calificaciones = new int[4];

    public notas(int P1, int P2, int P3, int P4){
        calificaciones[0] = P1;
        calificaciones[1] = P2;
        calificaciones[2] = P3;
        calificaciones[3] = P4;
    }

    public int[] obtenerCalificaciones(){
        return calificaciones;
    }

    public int get3(){
        int pos = 2;
        return calificaciones[pos];
    }
}
