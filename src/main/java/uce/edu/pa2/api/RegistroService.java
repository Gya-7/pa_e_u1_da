package uce.edu.pa2.api;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;


@ApplicationScoped
public class RegistroService {

    @Inject
    private Instance<TipoAuditoria> tipoAuditorias;
    

    @Auditoria
    public void registrar (Usuario user, String evento){

        System.out.println("\nRegistrando evento: " + evento);

        for(TipoAuditoria c: tipoAuditorias){

            c.imprimir(user);

        }

    }

}
