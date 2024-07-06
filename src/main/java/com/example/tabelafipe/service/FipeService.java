package com.example.tabelafipe.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
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

    public String listarModelos(int idModelo){
        return consultaUrl("https://parallelum.com.br/fipe/api/v1/carros/marcas/"+ idModelo + "/modelos");
    }

    public String consultarAno(int modelo, int marca){
        return consultaUrl("https://parallelum.com.br/fipe/api/v1/carros/marcas/"+ modelo + "/modelos/" + marca + "/anos");
    }

    public String consultarValor(int modelo, int marca, String ano){
        return consultaUrl("https://parallelum.com.br/fipe/api/v1/carros/marcas/" + modelo + "/modelos/" + marca +
                "/anos/" + ano);
    }

}
