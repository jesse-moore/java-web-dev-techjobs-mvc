package org.launchcode.javawebdevtechjobsmvc;

import org.launchcode.javawebdevtechjobsmvc.models.Job;
import org.launchcode.javawebdevtechjobsmvc.models.JobData;


import java.util.ArrayList;

public class Search {

    public static ArrayList<Job> find(String term, String type){
        if(term.isBlank() || term.equals("all")) {
            return JobData.findAll();
        } else {
            return JobData.findByColumnAndValue(type, term);
        }
    }
}
