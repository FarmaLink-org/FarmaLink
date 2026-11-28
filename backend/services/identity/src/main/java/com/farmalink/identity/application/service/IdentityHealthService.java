package com.farmalink.identity.application.service;

import com.farmalink.identity.domain.model.HealthStatus;
import com.farmalink.identity.domain.port.in.CheckIdentityHealthUseCase;
import com.farmalink.identity.domain.port.out.ServiceInfoPort;
import java.time.Instant;

public class IdentityHealthService implements CheckIdentityHealthUseCase {

    private final ServiceInfoPort serviceInfoPort;

    public IdentityHealthService(ServiceInfoPort serviceInfoPort) {
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