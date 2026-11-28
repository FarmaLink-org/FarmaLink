package com.farmalink.organization.infrastructure.config;

import com.farmalink.organization.application.service.OrganizationHealthService;
import com.farmalink.organization.domain.port.in.CheckOrganizationHealthUseCase;
import com.farmalink.organization.domain.port.out.ServiceInfoPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HexagonalWiringConfig {

    @Bean
    public CheckOrganizationHealthUseCase checkOrganizationHealthUseCase(ServiceInfoPort serviceInfoPort) {
        return new OrganizationHealthService(serviceInfoPort);
    }
}