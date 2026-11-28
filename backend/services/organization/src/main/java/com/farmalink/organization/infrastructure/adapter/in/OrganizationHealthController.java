package com.farmalink.organization.infrastructure.adapter.in.web;

import com.farmalink.organization.domain.port.in.CheckOrganizationHealthUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/organizations")
public class OrganizationHealthController {

    private final CheckOrganizationHealthUseCase checkOrganizationHealthUseCase;

    public OrganizationHealthController(CheckOrganizationHealthUseCase checkOrganizationHealthUseCase) {
        this.checkOrganizationHealthUseCase = checkOrganizationHealthUseCase;
    }

    @GetMapping("/health")
    public ResponseEntity<HealthResponseDto> health() {
        HealthResponseDto response = HealthResponseDto.fromDomain(checkOrganizationHealthUseCase.checkHealth());
        return ResponseEntity.ok(response);
    }
}