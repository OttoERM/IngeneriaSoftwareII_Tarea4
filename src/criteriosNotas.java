public enum criteriosNotas {
    reprobado(59, "Reprobado"),
    aprobado(84, "Aprobado"),
    aprobadoConHonores(100, "Aprobado con honores");

    public int criterioNota;
    public String evaluacion;

    private criteriosNotas(int criterioNota, String evaluacion){
        this.criterioNota = criterioNota;
        this.evaluacion = evaluacion;
    }

    public void printEvaluacion(int nota, String mensaje){
        System.out.println("Nota:" + nota + " - " + mensaje);
    }
}
