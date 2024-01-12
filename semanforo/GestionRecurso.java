package semanforo;

import java.util.concurrent.Semaphore;

public class GestionRecurso {
	
	private final Semaphore semaphore;

    public GestionRecurso(int k) {
    	//k es plaza de semanforo
        this.semaphore = new Semaphore(k);
    }

    public void reserva(int r) throws InterruptedException {
        semaphore.acquire(r);
    }

    public void libera(int l) {
        semaphore.release(l);
    }

}
