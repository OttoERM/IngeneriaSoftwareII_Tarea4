public class Main {
    public static void main(String[] args) {
        tipoPersona[] tipo = tipoPersona.values();
        persona person1 = new persona(125, "Pedro", tipo[1].tipo, 70, 80, 30, 100);
        revisarNotas(person1);
    }

    public static void revisarNotas(persona person){
        int[] calificaciones = person.obtenerNotas();
        for (int i = 0; i < calificaciones.length; i++) {
            if(calificaciones[i] < 60)
                System.out.println("Se aplazo en P" + i);
            else if(!aprobado_reprobado(calificaciones[i], 85)){
                System.out.println("Aprobo en P" + i);
            }else {
                System.out.println("Aprobo con honores en P" + i);
            }
        }
    }

    public static boolean aprobado_reprobado(int nota1, int nota2){
        if(nota1 < nota2)
            return true;
        else
            return false;
    }
}