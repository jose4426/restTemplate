package com.example.MS_A;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
@AllArgsConstructor
public class ProductServ {
    @Autowired
    private RestTemplate restTemplate;

    public List<ProductResponse> getAllB() {
        String url = "http://localhost:8086/api/lista";
        ProductResponse[] response = restTemplate.getForObject(url, ProductResponse[].class);
        assert response != null;
        return Arrays.asList(response);
    }
}
