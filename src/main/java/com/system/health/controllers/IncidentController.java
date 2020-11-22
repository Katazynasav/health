package com.system.health.controllers;

import com.system.health.models.Incident;
import com.system.health.services.IncidentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import javax.annotation.Resource;
import java.util.List;

@Controller
public class IncidentController {
    @Resource
    private IncidentService incidentService;

    @GetMapping("/incidents")
    public String showListOfIncidents(Model model){
        List<Incident> incidents = incidentService.findAll();
        model.addAttribute("incidents",incidents);
        return "index";
    }

    @GetMapping("/signup")
    public String showSingUpForm(Incident incident){
        return "add";
     }

    @PostMapping("/incidents")
    public String addIncident(Incident incident, Model model){
        incidentService.createIncident(incident);
        model.addAttribute("incidents",incidentService.findAll());
        return "redirect:/index";
    }

}
