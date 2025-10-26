package ar.unahur.edu.obj2.patroncommand.operaciones;

import ar.unahur.edu.obj2.patroncommand.microcontrolador.Microcontrolador;

public class Lodv extends Comando {
    private Integer valor;

    public Lodv(Integer valor) {
        this.valor = valor;
    }

    @Override
    protected void doExecute(Microcontrolador micro) {
        micro.setAcumuladorA(valor);
    }

}
