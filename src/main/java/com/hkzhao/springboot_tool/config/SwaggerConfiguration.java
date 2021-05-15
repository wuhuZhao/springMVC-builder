package com.hkzhao.springboot_tool.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * <h3>springboot_tool</h3>
 * <p></p>
 *
 * @author : hkzhao
 * @date : 2021-05-15 10:57
 **/
//http://127.0.0.1:8080/swagger-ui/
@Configuration
public class SwaggerConfiguration {
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(this.apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.hkzhao.springboot_tool.controller"))
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("example doc")
                .description("for my builder project")
                .version("1.0.0")
                .contact(new Contact("hkzhao","https://leetcode-cn.com/u/hkzhao/","zbczhao@qq.com"))
                .build();
    }
}
