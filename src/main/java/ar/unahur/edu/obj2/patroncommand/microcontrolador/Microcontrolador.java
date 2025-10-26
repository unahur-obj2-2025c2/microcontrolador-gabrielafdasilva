package ar.unahur.edu.obj2.patroncommand.microcontrolador;

import java.util.Arrays;
import java.util.List;

import ar.unahur.edu.obj2.patroncommand.operaciones.Operable;

public class Microcontrolador implements Programable{
    private Integer acumuladorA;
    private Integer acumuladorB;
    private Integer programCounter;
    private List<Integer> memoria = Arrays.asList(new Integer[1024]); // area de 1024 valores enteros
    
    
    
    public Microcontrolador() {
        this.acumuladorA = 0;
        this.acumuladorB = 0;
        this.programCounter = 0;
    }
    @Override
    public void run(List<Operable> operaciones) {
        operaciones.forEach(operacion -> operacion.execute(this));
    }
    @Override
    public void incProgramCounter() {
        programCounter++;
    }
    @Override
    public Integer getProgramCounter() {
        return programCounter;
    }
    @Override
    public void setAcumuladorA(Integer value) {
        this.acumuladorA = value;
    }
    @Override
    public Integer getAcumuladorA() {
       
        return acumuladorA;
    }
    @Override
    public void setAcumuladorB(Integer value) {
        this.acumuladorB = value;
    }

    @Override
    public Integer getAcumuladorB() {
        return acumuladorB;
    }

    @Override
    public void setAddr(Integer addr) {
        estaEnRango(addr);
        memoria.set(addr, this.getAcumuladorA());
    }
    private void estaEnRango(Integer addr) {
        if (addr < 0 || addr >= memoria.size()) {
            throw new RuntimeException("Direccion de memoria fuera de rango: " + addr);
        }
    }
    @Override
    public Integer getAddr(Integer addr) {
        estaEnRango(addr);
       return memoria.get(addr);
    }
    @Override
    public void reset() {
        this.acumuladorA = 0;
        this.acumuladorB = 0;
        this.programCounter = 0;
        this.memoria = Arrays.asList(new Integer[1024]);
    }
        
    
    
}
