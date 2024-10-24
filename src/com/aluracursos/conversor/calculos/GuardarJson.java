package com.aluracursos.conversor.calculos;

import com.aluracursos.conversor.modelos.CambioRealizado;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GuardarJson {
    public  void crearArchivo(CambioRealizado cambioRealizado) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escritura = new FileWriter("Historial"+cambioRealizado.getValorIngresado()+"_"+cambioRealizado.getTasaAplicada()+"_"+cambioRealizado.getValorObtenido()+".json");
        escritura.write(gson.toJson(cambioRealizado));
        escritura.close();
    }
}
