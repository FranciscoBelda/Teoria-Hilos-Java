package teoria.base;

import java.util.concurrent.Semaphore;

public class HiloBase extends Thread{

    private int valor = 0;
    public static int valorGlobal = 0;

    private static final Semaphore semaphore = new Semaphore(1);

    public HiloBase(String name, int prioridad) {
        super(name);
        setPriority(prioridad);
        start();
    }
    @Override
    public void run() {
        for (int i = 0; i < 20000; i++) {
            System.out.println("Hola soy un hilo "+getName()+
                    " y tengo valor "+ valor++ +" y el valor global es !!!");

            try {
                semaphore.acquire(); // SEM -1 => SEM = 0
            } catch (InterruptedException e) {
                System.out.println("Hilo Interrumpido");
            }
            int valorAux = valorGlobal;
            valorAux++;
            valorGlobal = valorAux;
            semaphore.release(); // SEM + 1 => SEM = 1

        }
    }
}
