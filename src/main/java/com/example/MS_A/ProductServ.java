package com.example.MS_A;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductServ {
    @Autowired
    private WebClient.Builder webClientBuilder;

    public List<ProductResponse> getAll() {

        ProductResponse[] responseArray = webClientBuilder.build()
                .get()
                .uri("http://localhost:8086/api/lista")
                .retrieve()
                .bodyToMono((ProductResponse[].class))
                .block(); //
        return Arrays.asList(responseArray);

    }


}
