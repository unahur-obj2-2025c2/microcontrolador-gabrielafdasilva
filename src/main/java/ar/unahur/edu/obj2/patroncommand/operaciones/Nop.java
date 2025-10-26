package ar.unahur.edu.obj2.patroncommand.operaciones;

import ar.unahur.edu.obj2.patroncommand.microcontrolador.Microcontrolador;

public class Nop extends Comando{

    @Override
    protected void doExecute(Microcontrolador micro) {
        // No hace nada
    }

}
