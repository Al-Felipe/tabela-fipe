package com.example.tabelafipe.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@org.springframework.stereotype.Service
public class FipeService {

    public String consultaUrl(String url){
        String dados = "";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);

        if(responseEntity.getStatusCode().is2xxSuccessful()){
            dados = responseEntity.getBody();
        } else {
            dados = "Falha ao obter informações. Código de status: " + responseEntity.getStatusCode();
        }
        return dados;
    }

    public String listarMarcas(){
        return consultaUrl("https://parallelum.com.br/fipe/api/v1/carros/marcas");
    }

}
