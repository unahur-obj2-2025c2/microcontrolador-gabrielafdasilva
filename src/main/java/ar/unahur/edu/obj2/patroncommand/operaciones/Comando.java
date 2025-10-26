package ar.unahur.edu.obj2.patroncommand.operaciones;

import ar.unahur.edu.obj2.patroncommand.microcontrolador.Microcontrolador;

public abstract class Comando implements Operable {
    

    @Override
    public void execute(Microcontrolador micro) {
        doExecute(micro);
        micro.incProgramCounter(); 
        
    }
    protected void doExecute(Microcontrolador micro) {
        
    }
}
