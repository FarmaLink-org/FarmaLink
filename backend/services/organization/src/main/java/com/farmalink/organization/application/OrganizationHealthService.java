package com.farmalink.organization.application.service;

import com.farmalink.organization.domain.model.HealthStatus;
import com.farmalink.organization.domain.port.in.CheckOrganizationHealthUseCase;
import com.farmalink.organization.domain.port.out.ServiceInfoPort;
import java.time.Instant;

public class OrganizationHealthService implements CheckOrganizationHealthUseCase {

    private final ServiceInfoPort serviceInfoPort;

    public OrganizationHealthService(ServiceInfoPort serviceInfoPort) {
        this.serviceInfoPort = serviceInfoPort;
    }

    @Override
    public HealthStatus checkHealth() {
        return new HealthStatus(
                serviceInfoPort.getServiceName(),
                serviceInfoPort.getVersion(),
                serviceInfoPort.getEnvironment(),
                "UP",
                Instant.now()
        );
    }
}