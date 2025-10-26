package ar.unahur.edu.obj2.patroncommand.invoker;

import java.util.ArrayList;
import java.util.List;

import ar.unahur.edu.obj2.patroncommand.microcontrolador.Programable;
import ar.unahur.edu.obj2.patroncommand.operaciones.Operable;

public class Programa {
    private List<Operable> operaciones;

    public Programa() {
        this.operaciones = new ArrayList<>();
    }

    public void agregarOperacion(Operable operacion) {
        operaciones.add(operacion);
    }

    public void vaciarOperaciones() {
        operaciones.clear();
    }
    
    public void ejecutar(Programable micro) {
        micro.run(operaciones);
    }
}
