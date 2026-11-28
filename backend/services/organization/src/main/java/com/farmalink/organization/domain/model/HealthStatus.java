package com.farmalink.organization.domain.model;

import java.time.Instant;

public record HealthStatus(
        String serviceName,
        String version,
        String environment,
        String status,
        Instant checkedAt
) {
}