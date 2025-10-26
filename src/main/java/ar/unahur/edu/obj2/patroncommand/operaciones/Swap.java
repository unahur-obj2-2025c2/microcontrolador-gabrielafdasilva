package ar.unahur.edu.obj2.patroncommand.operaciones;

import ar.unahur.edu.obj2.patroncommand.microcontrolador.Microcontrolador;

public class Swap extends Comando {

    @Override
    public void doExecute(Microcontrolador micro) {
    Integer auxiliar = micro.getAcumuladorA();
    micro.setAcumuladorB(micro.getAcumuladorA());
    micro.setAcumuladorA(auxiliar);
    
    }

}
