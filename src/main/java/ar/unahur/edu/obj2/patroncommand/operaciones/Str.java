package ar.unahur.edu.obj2.patroncommand.operaciones;

import ar.unahur.edu.obj2.patroncommand.microcontrolador.Microcontrolador;

public class Str extends Comando {
    private Integer direccion;

    public Str(Integer direccion) {
        this.direccion = direccion;
    }

    @Override
    protected void doExecute(Microcontrolador micro) {
       micro.setAddr(direccion);
    }

}
