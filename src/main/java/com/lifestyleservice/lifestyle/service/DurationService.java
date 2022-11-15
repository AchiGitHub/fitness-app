package com.lifestyleservice.lifestyle.service;

import com.lifestyleservice.lifestyle.entity.Duration;
import com.lifestyleservice.lifestyle.util.TransportDto;

public interface DurationService {
    TransportDto getDurations();
    TransportDto createDuration(Duration duration);
    TransportDto editDuration(Long id, Duration duration);
    boolean deleteDuration(Long id);
}
