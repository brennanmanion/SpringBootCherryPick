package com.brennanmanion;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/spring/api")
public class SpringRestApi {

    @PostMapping(value = "/customer", consumes = {MediaType.TEXT_PLAIN_VALUE}, produces = {MediaType.TEXT_PLAIN_VALUE})
    public String createNewCustomer (@RequestBody String customer){
            String[] data= customer.split(",");
            return (data[0] + " has been created successfully");
    }

    @GetMapping(value = "/test")
    public String testWS ( ){
        return  "Spring REST API is working";
    }
}
