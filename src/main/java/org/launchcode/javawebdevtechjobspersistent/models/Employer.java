package org.launchcode.javawebdevtechjobspersistent.models;


import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Employer extends AbstractEntity {

    @NotNull
    @Size(min = 3, max = 50)
    private String location;

    @OneToMany
    @JoinColumn
    private List<Job> jobs = new ArrayList<Job>();


    public Employer() {
    }

    public Employer(String aLocation, List<Job> aJobs) {
        super();
        this.location = aLocation;
        this.jobs = aJobs;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

