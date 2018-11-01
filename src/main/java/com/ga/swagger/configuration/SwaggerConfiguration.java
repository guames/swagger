package com.ga.swagger.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    public static final Contact DEFAULT_CONTACT = new Contact("Gustavo Ames"
            , "https://github.com/guames/swagger"
            , "gustavo.ames87@gmail.com");

    public static final ApiInfo DEFAULT_API_INFO = new ApiInfo("Swagger RestFull API"
            ,"This API is open, this API was created for auxiliary in the process of create a new documentation for all kind of projects."
            ,"1.0.0"
            ,"This code is opensource."
            , DEFAULT_CONTACT
            ,"GNU"
            ,"https://www.gnu.org/licenses/gpl-3.0.pt-br.html"
            , new ArrayList<>());

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(DEFAULT_API_INFO);
    }

}
