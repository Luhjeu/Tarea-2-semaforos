package semanforo;

public class Main {

	public static final int procesos = 5;

	public static void main(String[] args) {
		GestionRecurso recurso = new GestionRecurso(10); // 10 recursos

		// Crear y ejecutar procesos
		for (int i = 0; i < procesos; i++) {
			Proceso p = new Proceso((i + 1), recurso, 2, 2);
			p.start();
		}
	}
}
