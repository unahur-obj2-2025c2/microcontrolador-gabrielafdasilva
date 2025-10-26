package ar.unahur.edu.obj2.patroncommand.operaciones;

import ar.unahur.edu.obj2.patroncommand.microcontrolador.Microcontrolador;

public class Lod extends Comando {
    private Integer direccion;

    public Lod(Integer direccion) {
        this.direccion = direccion;
    }

    @Override
    public void doExecute(Microcontrolador micro) {
        Integer valor = micro.getAddr(direccion);
        micro.setAcumuladorA(valor);
    }

    

}
