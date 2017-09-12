package com.iqmsoft.ozark.payara.web;

import com.iqmsoft.ozark.payara.clock.AtmClock;
import com.oracle.ozark.core.Models;
import javax.inject.Inject;
import javax.mvc.Controller;
import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Controller
@Path("time")
public class ClockController {

    @Inject
    Models models;

    @Inject
    AtmClock clock;

    @GET
    public String now() {
        this.models.put("time", new Clock(clock.currentTime()));
        return "/time.jsp";
    }

}
