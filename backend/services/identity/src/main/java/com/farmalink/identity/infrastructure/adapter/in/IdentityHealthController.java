package com.farmalink.identity.infrastructure.adapter.in.web;

import com.farmalink.identity.domain.port.in.CheckIdentityHealthUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/identity")
public class IdentityHealthController {

    private final CheckIdentityHealthUseCase checkIdentityHealthUseCase;

    public IdentityHealthController(CheckIdentityHealthUseCase checkIdentityHealthUseCase) {
        this.checkIdentityHealthUseCase = checkIdentityHealthUseCase;
    }

    @GetMapping("/health")
    public ResponseEntity<HealthResponseDto> health() {
        HealthResponseDto response = HealthResponseDto.fromDomain(checkIdentityHealthUseCase.checkHealth());
        return ResponseEntity.ok(response);
    }
}