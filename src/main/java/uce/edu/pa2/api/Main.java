package uce.edu.pa2.api;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main {

    public static void main(String[] args) {

        Quarkus.run(App.class, args);
        
    }

    public static class App implements QuarkusApplication{

        @Inject
        private RegistroService registroService;

        @Override
        public int run(String... args) throws Exception {

            System.out.print("-----------------------------------");
            Usuario u = new Usuario ("Dayerlin", 17);
            Usuario u1 = new Usuario("Luis", 18);
            Usuario u2 = new Usuario("Alfredo", 19);

            System.out.println("\nAuditoria 1");
            registroService.registrar(u, "C");
            System.out.println("\nAuditoria 2");
            registroService.registrar(u1, "N");
            System.out.println("\nAuditoria 3");
            registroService.registrar(u2, "C");

            

            System.out.println("-----------------------------------");



            return 0;
        }

    }

}
