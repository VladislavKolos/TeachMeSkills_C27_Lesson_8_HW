package com.teachmeskills.hw8.doctor.basedoctor;

/**
 * Abstract class for doctors view
 * contains fields department, jobTitle
 * contains constructor.
 */
public abstract class BaseDoctor {
    public String department;
    public String jobTitle;

    public BaseDoctor(String department, String jobTitle) {
        this.department = department;
        this.jobTitle = jobTitle;
    }
}
