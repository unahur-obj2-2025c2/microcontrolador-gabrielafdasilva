package ar.unahur.edu.obj2.patroncommand.operaciones;

import ar.unahur.edu.obj2.patroncommand.microcontrolador.Microcontrolador;

public class Add extends Comando {

    @Override
    public void doExecute(Microcontrolador micro) {
    Integer resultado = micro.getAcumuladorA() + micro.getAcumuladorB();
    micro.setAcumuladorA(resultado);
    micro.setAcumuladorB(0);
    
    }

}
