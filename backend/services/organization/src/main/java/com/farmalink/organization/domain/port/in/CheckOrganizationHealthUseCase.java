package com.farmalink.organization.domain.port.in;

import com.farmalink.organization.domain.model.HealthStatus;

public interface CheckOrganizationHealthUseCase {
    HealthStatus checkHealth();
}