package com.farmalink.identity.infrastructure.config;

import com.farmalink.identity.application.service.IdentityHealthService;
import com.farmalink.identity.domain.port.in.CheckIdentityHealthUseCase;
import com.farmalink.identity.domain.port.out.ServiceInfoPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HexagonalWiringConfig {

    @Bean
    public CheckIdentityHealthUseCase checkIdentityHealthUseCase(ServiceInfoPort serviceInfoPort) {
        return new IdentityHealthService(serviceInfoPort);
    }
}