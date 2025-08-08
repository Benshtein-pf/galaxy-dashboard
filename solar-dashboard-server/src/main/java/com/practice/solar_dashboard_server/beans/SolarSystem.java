package com.practice.solar_dashboard_server.beans;

import org.springframework.data.annotation.Id;

import java.util.UUID;

public record SolarSystem(@Id UUID uuid, String name) {
}
