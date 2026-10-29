package teoria.base;

import java.util.ArrayList;

public class BasePrincipal {
    static void main() {
        ArrayList<HiloBase> hilos = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            hilos.add(new HiloBase("Hilo "+i,i));
        }

        Thread hiloPaco  = new HiloBase("Paco", 1);
        Thread hiloPepe  = new HiloBase("Pepe", 10);

        for (int i = 0; i < 1000; i++) {
            System.out.println("Soy el Principal!!!");
        }

        try {
            hiloPepe.join();
            hiloPaco.join();
            for (HiloBase hilo: hilos){
                hilo.join();
            }
        } catch (InterruptedException e) {
            System.out.println("Hilo interrumpido");
        }

        System.out.println("Han terminado todos los hilos. ValorGlobal vale: "+
                HiloBase.valorGlobal);

    }
}
