package ar.unahur.edu.obj2.patroncommand;


import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.unahur.edu.obj2.patroncommand.invoker.Programa;
import ar.unahur.edu.obj2.patroncommand.microcontrolador.Microcontrolador;
import ar.unahur.edu.obj2.patroncommand.microcontrolador.Programable;
import ar.unahur.edu.obj2.patroncommand.operaciones.Add;
import ar.unahur.edu.obj2.patroncommand.operaciones.Lod;
import ar.unahur.edu.obj2.patroncommand.operaciones.Lodv;
import ar.unahur.edu.obj2.patroncommand.operaciones.Nop;
import ar.unahur.edu.obj2.patroncommand.operaciones.Str;
import ar.unahur.edu.obj2.patroncommand.operaciones.Swap;

public class ProgramaTest {

   Programable micro = new Microcontrolador(); 
   Programa programa = new Programa();

    @BeforeEach
    void setUp(){
        programa.vaciarOperaciones();
        micro.reset();
    }

    @Test
    void hacerAvanzarTresPosicionesAlProgram() {
        programa.agregarOperacion(new Nop());
        programa.agregarOperacion(new Nop());
        programa.agregarOperacion(new Nop());

        programa.ejecutar(micro);

        assertTrue(micro.getProgramCounter() == 3);
    }

    @Test
    void sumar20Mas17_VerificarAcumuladorA_VerificarAcumuladorB_YProgramCounter() {
        programa.agregarOperacion(new Lodv(20));
        programa.agregarOperacion(new Swap());
        programa.agregarOperacion(new Lodv(17));
        programa.agregarOperacion(new Add());

        programa.ejecutar(micro);

        assertTrue(micro.getAcumuladorA() == 37);
        assertTrue(micro.getAcumuladorB() == 0);
        assertTrue(micro.getProgramCounter() == 4);
    }

    @Test
    void Sumar2Mas8Mas5_VerificarAcumuladorA__YAcumuladorB() {
        programa.agregarOperacion(new Lodv(2));
        programa.agregarOperacion(new Str(0));
        programa.agregarOperacion(new Lodv(8));
        programa.agregarOperacion(new Swap());
        programa.agregarOperacion(new Lodv(5));        
        programa.agregarOperacion(new Add());
        programa.agregarOperacion(new Swap());
        programa.agregarOperacion(new Lod(0));        
        programa.agregarOperacion(new Add());

        programa.ejecutar(micro);

        assertTrue(micro.getAcumuladorA() == 15);
        assertTrue(micro.getAcumuladorB() == 0);

    }

}
