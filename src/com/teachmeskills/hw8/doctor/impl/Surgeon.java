package com.teachmeskills.hw8.doctor.impl;

import com.teachmeskills.hw8.doctor.basedoctor.BaseDoctor;
import com.teachmeskills.hw8.doctor.iheal.IHeal;

/**
 * Class for the surgeon doctors type
 * contains field name
 * contains constructor
 * contains required method heal patient with parameter healPlan.
 */
public class Surgeon extends BaseDoctor implements IHeal {
    String name;

    public Surgeon(String department, String jobTitle, String name) {
        super(department, jobTitle);
        this.name = name;
    }

    @Override
    public void heal(long healPlan) {
        System.out.println(super.department);
        System.out.println(super.jobTitle);
        System.out.println("My name is " + this.name);
        System.out.println("I heal like a surgeon");
    }
}
