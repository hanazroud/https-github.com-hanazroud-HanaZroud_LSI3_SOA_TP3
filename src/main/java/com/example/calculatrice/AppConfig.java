package com.example.calculatrice;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

/**
 * Classe de configuration Jersey.
 * @ApplicationPath("/api") définit le chemin de base pour toutes les ressources REST.
 */
@ApplicationPath("/api")
public class AppConfig extends Application {

    // Jersey détectera automatiquement toutes les classes annotées @Path
}
