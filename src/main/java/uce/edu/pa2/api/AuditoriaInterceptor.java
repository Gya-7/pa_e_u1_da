package uce.edu.pa2.api;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Auditoria
@Interceptor
public class AuditoriaInterceptor {

    @AroundInvoke
    public Object auditar(InvocationContext context) throws Exception {

        Object[] args = context.getParameters();

        for (int i = 0; i < 1; i++) {

            System.out.print("Auditando a -> ");

            Object obj = args[i];
            Usuario us = (Usuario) obj;

            System.out.print("Nombre: " + us.getNombre() + ", ID: " + us.getId());

        }

        Object resultado = context.proceed();

        return resultado;

    }

}
