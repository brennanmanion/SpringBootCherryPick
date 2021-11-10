package com.brennanmanion.RestEasyConfig;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.springframework.context.annotation.Configuration;

@Configuration
@ApplicationPath("/api/v1")
public class RestEasyConfig extends Application {

}
