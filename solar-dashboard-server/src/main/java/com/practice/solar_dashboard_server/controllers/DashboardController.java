package com.practice.solar_dashboard_server.controllers;

import com.practice.solar_dashboard_server.beans.Planet;
import com.practice.solar_dashboard_server.repositories.PlanetRepository;
import com.practice.solar_dashboard_server.repositories.SolarSystemRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DashboardController {
    private final PlanetRepository planets;
    private final SolarSystemRepository solarSystems;


    public DashboardController(SolarSystemRepository solarSystems, PlanetRepository planets) {
        this.planets = planets;
        this.solarSystems = solarSystems;
    }

    @GetMapping("/plants")
    public List<Planet> getPlanets() {
        return planets.findAll();
    }

    public void fillDB() {
        planets.save(null); // TODO: create default values
        solarSystems.save(null);
    }
}
