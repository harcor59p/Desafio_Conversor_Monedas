package com.aluracursos.conversor.calculos;
import com.aluracursos.conversor.modelos.CambioRealizado;
import com.aluracursos.conversor.modelos.Moneda;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;


public class CalculoTRM {

    public CalculoTRM(Integer opcionSeleccionada) throws IOException {
        ConsultaTasas consulta = new ConsultaTasas();
        Moneda moneda = consulta.consultaTasa() ;
        double valorCOP = moneda.conversion_rates().COP();
        double valorARS = moneda.conversion_rates().ARS();
        double valorBRL = moneda.conversion_rates().BRL();
        double valorAUD = moneda.conversion_rates().AUD();
        double valorEUR = moneda.conversion_rates().EUR();
        double valorJPY = moneda.conversion_rates().JPY();
        System.out.println("Ingrese el valor que desea convertir: ");
        Scanner lecturaValor = new Scanner(System.in);
        var valorAConvertir = Double.valueOf(lecturaValor.nextDouble());

        double valorMoneda = 0 ;
        double valorConvertido = 0 ;
        String nombreMoneda = "";
        String comentario = "" ;

        switch (opcionSeleccionada){
            case 1,2:
                valorMoneda = valorCOP ;
                nombreMoneda = "Pesos Colombianos" ;
                break;
            case 3,4:
                valorMoneda = valorARS ;
                nombreMoneda = "Pesos Argentinos" ;
                break;
            case 5,6:
                valorMoneda = valorBRL ;
                nombreMoneda = "Reales Brasileros" ;
                break;
            case 7,8:
                valorMoneda = valorAUD ;
                nombreMoneda = "Dolares Australianos" ;
                break;
            case 9,10:
                valorMoneda = valorEUR ;
                nombreMoneda = "Euros" ;
                break;
            case 11,12:
                valorMoneda = valorJPY ;
                nombreMoneda = "Yenes Japoneses" ;
                break;
            default:
                System.out.println("Opción no valida");;
        }

        if ((opcionSeleccionada % 2) != 0){
            valorConvertido = valorMoneda * valorAConvertir ;

            comentario = ("El valor de "+ valorAConvertir + " Dolares Americanos equivale a " + Math.round(valorConvertido * 100.00 ) /100.00 + " " + nombreMoneda  );
            System.out.println(comentario);
        }else {
            valorConvertido = valorAConvertir / valorMoneda ;
            comentario =("El valor de "+ valorAConvertir + " " + nombreMoneda +" equivale a " + Math.round(valorConvertido * 100.00 ) /100.00 + " Dolares Americanos" );
            System.out.println(comentario);
        }

        CambioRealizado cambio = new CambioRealizado() ;
        cambio.setFechaCambio(String.valueOf(new Date()));
        cambio.setValorIngresado(valorAConvertir);
        cambio.setTasaAplicada(Math.round(valorMoneda * 100.00)/100.00);
        cambio.setValorObtenido(Math.round(valorConvertido * 100.00)/100.00);
        cambio.setLeyenda(comentario);
        GuardarJson generarArchivo = new GuardarJson();
        generarArchivo.crearArchivo(cambio);




    }







}
