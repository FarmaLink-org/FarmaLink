package com.farmalink.identity.domain.port.in;

import com.farmalink.identity.domain.model.HealthStatus;

public interface CheckIdentityHealthUseCase {
    HealthStatus checkHealth();
}