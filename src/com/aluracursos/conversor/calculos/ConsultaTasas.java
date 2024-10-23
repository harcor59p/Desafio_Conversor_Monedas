package com.aluracursos.conversor.calculos;

import com.aluracursos.conversor.modelos.Moneda;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaTasas {

    public Moneda consultaTasa(String codigoMoneda){

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/7a17c455d44411ec4828a563/latest/"+codigoMoneda+"/") ;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response;
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body() , Moneda.class );
        } catch (Exception e) {
            throw new RuntimeException("No encontre el código de esta moneda");
        }
    }

}

