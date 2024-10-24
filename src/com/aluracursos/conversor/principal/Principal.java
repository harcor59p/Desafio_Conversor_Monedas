package com.aluracursos.conversor.principal;
import com.aluracursos.conversor.calculos.CalculoTRM;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        System.out.println("**********************************************************");
        System.out.println("Bienvenido al conversor de Monedas");

        while (true){
            System.out.println("""
                1) Dolares Americanos =>> Peso Colombianos
                2) Pesos Colombianos =>> Dolares Americanos
                3) Dolares Americanos =>> Pesos Argentinos
                4) Pesos Argentinos =>> Dolares Americanos
                5) Dolares Americanos =>> Reales Brasileños
                6) Reales Brasileños =>> Dolares Americanos
                7) Dolares Americanos =>> Dolares Australianos
                8) Dolares Australianos =>> Dolares Americanos
                9) Dolares Americanos =>> Euros
                10) Euros =>> Dolares Americanos
                11) Dolares Americanos =>> Yenes Japoneses
                12) Yenes Japoneses =>> Dolares Americanos
                13) Salir
                Elija una opción válida: 
                ********************************************************************
                """);
            System.out.println("Indica el numero de la opcion deseada: ");
            Scanner lectura = new Scanner(System.in);
            var opcionSeleccionada = Integer.valueOf(lectura.nextInt());
            new CalculoTRM(opcionSeleccionada);
            if (opcionSeleccionada.equals(13)){
                break;
            }
        }
    }
}