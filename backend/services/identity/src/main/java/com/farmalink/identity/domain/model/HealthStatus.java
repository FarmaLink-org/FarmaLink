package com.farmalink.identity.domain.model;

import java.time.Instant;

public record HealthStatus(
        String serviceName,
        String version,
        String environment,
        String status,
        Instant checkedAt
) {
}