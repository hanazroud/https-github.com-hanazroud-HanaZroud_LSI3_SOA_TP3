package com.example.calculatrice;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@ApplicationPath("/api")
public class RestApplication extends Application {
    // Jersey découvre automatiquement les ressources dans ce package
}