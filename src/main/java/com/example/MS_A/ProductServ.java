package com.example.MS_A;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductServ {
    @Autowired
    private RestTemplate restTemplate;
    public List<ProductResponse> getProductFromB() {
        String url = "http://localhost:8086/api/lista"; // Ajusta la URL al endpoint de MS B
        ProductResponse[] response = restTemplate.getForObject(url, ProductResponse[].class);
        return Arrays.asList(response);
    }
}
