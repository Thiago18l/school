package com.stones.alliance.school;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/data")
public class GetMarvelData {
    
    @Value("${apiKey}")
    private String apiKey;
    
}
