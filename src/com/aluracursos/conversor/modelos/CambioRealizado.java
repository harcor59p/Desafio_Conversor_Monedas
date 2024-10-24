package com.aluracursos.conversor.modelos;

public class CambioRealizado {
    private  String fechaCambio  ;
    private double valorIngresado ;
    private double tasaAplicada  ;
    private double valorObtenido  ;
    private  String leyenda ;

    public void setFechaCambio(String fechaCambio) {
        this.fechaCambio = fechaCambio;
    }

    public double getValorIngresado() {
        return valorIngresado;
    }

    public double getTasaAplicada() {
        return tasaAplicada;
    }

    public String getLeyenda() {
        return leyenda;
    }

    public double getValorObtenido() {
        return valorObtenido;
    }

    public String getFechaCambio() {
        return fechaCambio;
    }

    public void setValorIngresado(double valorIngresado) {
        this.valorIngresado = valorIngresado;
    }

    public void setTasaAplicada(double tasaAplicada) {
        this.tasaAplicada = tasaAplicada;
    }

    public void setValorObtenido(double valorObtenido) {
        this.valorObtenido = valorObtenido;
    }

    public void setLeyenda(String leyenda) {
        this.leyenda = leyenda;
    }
}
