package tack.project.boot01.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import lombok.RequiredArgsConstructor;


@OpenAPIDefinition(info = @Info(title = "Zerock App",version = "v1"))
@RequiredArgsConstructor
@Configuration
public class SwaggerConfig {

    //////////////////////////////////////
    @Bean
    public GroupedOpenApi chatOpenApi() {

        String[] paths = {"/**"};

        return GroupedOpenApi.builder()
        .group("Zerock OPEN API v1")
        .pathsToMatch(paths)
        .build();

    }
    
}
