package semanforo;


public class Proceso extends Thread {
    private final GestionRecurso recurso;
    private final int cantidadReserva;
    private final int cantidadLibera;
    private int num_proceso;

    public Proceso(int num_proceso,GestionRecurso recurso, int cantidadReserva, int cantidadLibera) {
        this.num_proceso=num_proceso;
    	this.recurso = recurso;
        this.cantidadReserva = cantidadReserva;
        this.cantidadLibera = cantidadLibera;
    }

    @Override
    public void run() {
        try {
            // Intenta reservar los recursos
        	System.out.println("Soy proceso "+this.num_proceso+": prepara para reserva recurso");
            recurso.reserva(cantidadReserva);
            // Simula el uso de los recursos
        	System.out.println("================== Soy proceso "+this.num_proceso+": reserva recurso durante 3 s");

            Thread.sleep(3000); // Tiempo en milisegundos utilizando los recursos
            // Libera los recursos
            recurso.libera(cantidadLibera);
        	System.out.println("Soy proceso "+this.num_proceso+": libera recurso");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}