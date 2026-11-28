package com.farmalink.organization.infrastructure.adapter.in.web;

import com.farmalink.organization.domain.model.HealthStatus;
import java.time.Instant;

public record HealthResponseDto(
        String service,
        String version,
        String environment,
        String status,
        Instant timestamp
) {
    public static HealthResponseDto fromDomain(HealthStatus healthStatus) {
        return new HealthResponseDto(
                healthStatus.serviceName(),
                healthStatus.version(),
                healthStatus.environment(),
                healthStatus.status(),
                healthStatus.checkedAt()
        );
    }
}