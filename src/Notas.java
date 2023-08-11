public class Notas {
    private final int notasPorAnio = 4;
    public int[] notas;
    private static criteriosNotas[] criteriosDeEvaluacion = criteriosNotas.values();

    public Notas(int[] notas){
        try {
            if(notas.length != notasPorAnio)
                throw new NotasException("Formato para notas incorrecto");
            this.notas = notas;
        } catch (NotasException e){
            e.printStackTrace();
        }
    }

    public static void evaluarNotas(Notas calificaciones){
        for (int nota : calificaciones.notas) {
            for (criteriosNotas criterio : criteriosDeEvaluacion) {
                if(nota <= criterio.criterioNota){
                    criterio.printEvaluacion(nota, criterio.evaluacion);
                    break;
                }
            }
        }
    }
}
