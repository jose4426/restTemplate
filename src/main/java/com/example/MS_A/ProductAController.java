package com.example.MS_A;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class ProductAController {
    private ProductServ productService;

    @GetMapping("/lista")
    public List<ProductResponse> getAll() {
        return productService.getAllB();
    }
}
