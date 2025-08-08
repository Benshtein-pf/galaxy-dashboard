package com.practice.solar_dashboard_server.repositories;

import com.practice.solar_dashboard_server.beans.SolarSystem;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface SolarSystemRepository extends MongoRepository<SolarSystem, UUID> {
}
