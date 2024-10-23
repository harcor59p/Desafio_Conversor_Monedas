package com.aluracursos.conversor.principal;

import com.aluracursos.conversor.calculos.ConsultaTasas;
import com.aluracursos.conversor.modelos.Moneda;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaTasas consulta = new ConsultaTasas();
        System.out.println("**********************************************************");
        System.out.println("Bienvenido al conversor de Monedas");
        System.out.println("Escriba el codigo de la moneda que quiere de referencia (USD - Dolar Americano) - (COP -  Peso Colombiano) - (ARS -  Peso Argentino) - (EUR - Euro) - (JPY Yen Japones): ");
        var codigoMoneda = String.valueOf(lectura.nextLine()) ;
        Moneda moneda = consulta.consultaTasa(codigoMoneda) ;
        System.out.println(moneda);
    }
}
