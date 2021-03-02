package org.launchcode.javawebdevtechjobsmvc.controllers;

import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;

public class TechJobsController {
    private static HashMap<String, String> actionChoices;
    static HashMap<String, String> columnChoices;

    public TechJobsController() {
        actionChoices = new HashMap<>();
        actionChoices.put("search", "Search");
        actionChoices.put("list", "List");

        columnChoices = new HashMap<>();
        columnChoices.put("all", "All");
        columnChoices.put("employer", "Employer");
        columnChoices.put("location", "Location");
        columnChoices.put("positionType", "Position Type");
        columnChoices.put("coreCompetency", "Skill");
    }

    @ModelAttribute("actions")
    public HashMap<String, String> getActionChoices(){
        return actionChoices;
    }

    @ModelAttribute("columns")
    public HashMap<String, String> getColumnChoices(){
        return columnChoices;
    }
}
