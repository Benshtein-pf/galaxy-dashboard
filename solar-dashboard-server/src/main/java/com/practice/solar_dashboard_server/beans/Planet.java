package com.practice.solar_dashboard_server.beans;

import org.springframework.data.annotation.Id;

import java.util.UUID;

public record Planet(@Id UUID id, String name, String color, Location location, UUID solarSystemId) {
}
