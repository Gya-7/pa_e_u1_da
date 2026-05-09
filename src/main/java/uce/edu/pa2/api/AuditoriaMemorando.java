package uce.edu.pa2.api;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(2)
public class AuditoriaMemorando implements TipoAuditoria{

    @Override
    public void imprimir(Usuario us) {
        System.out.println("Auditando " + us.getNombre() + " por Memorando");
    }

}
