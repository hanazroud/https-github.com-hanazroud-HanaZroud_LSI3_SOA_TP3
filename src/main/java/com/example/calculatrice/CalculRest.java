package com.example.calculatrice;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;


/**
 * Ressource REST pour les opérations de calculatrice.
 * Accessible via /api/calcul/*
 */
@Path("/calcul")
@Produces(MediaType.APPLICATION_JSON)
public class CalculRest {

    private final Calculatrice calculatrice = new Calculatrice();

    @GET
    @Path("/add")
    public Operation addition(@QueryParam("a") double a,
                              @QueryParam("b") double b) {
        double res = calculatrice.addition(a, b);
        return new Operation("addition", a, b, res);
    }

    @GET
    @Path("/sub")
    public Operation soustraction(@QueryParam("a") double a,
                                  @QueryParam("b") double b) {
        double res = calculatrice.soustraction(a, b);
        return new Operation("soustraction", a, b, res);
    }

    @GET
    @Path("/mul")
    public Operation multiplication(@QueryParam("a") double a,
                                    @QueryParam("b") double b) {
        double res = calculatrice.multiplication(a, b);
        return new Operation("multiplication", a, b, res);
    }

    @GET
    @Path("/div")
    public Operation division(@QueryParam("a") double a,
                              @QueryParam("b") double b) {
        double res = calculatrice.division(a, b);
        return new Operation("division", a, b, res);
    }
}


