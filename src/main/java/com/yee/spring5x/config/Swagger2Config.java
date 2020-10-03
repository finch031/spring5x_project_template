package com.yee.spring5x.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author yusheng
 * @version 1.0.0
 * @datetime 2020/10/3 12:57
 */
@Component
@Configuration
@EnableWebMvc
@EnableSwagger2
@ComponentScan(basePackages = {"com.yee.spring5x.controller"})
public class Swagger2Config extends WebMvcConfigurationSupport{

    @Value("${swaggerShow}")
    private boolean swaggerShow;

    @Bean
    public Docket createRestApi() {
        return new Docket(
                DocumentationType.SWAGGER_2)
                .enable(swaggerShow)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("YuSheng", "https://github.com/finch0001", "1434742890@qq.com");
        return new ApiInfoBuilder()
                .title("Swagger2 API 测试")
                .description("Spring5x Swagger Api")
                .contact(contact)
                .version("V_1.0.1")
                .build();
    }

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        if (this.swaggerShow) {
            registry.addResourceHandler("/swagger-ui.html").addResourceLocations(
                    "classpath:/META-INF/resources/");
            registry.addResourceHandler("/webjars/**").addResourceLocations(
                    "classpath:/META-INF/resources/webjars/");
        }
    }

}
