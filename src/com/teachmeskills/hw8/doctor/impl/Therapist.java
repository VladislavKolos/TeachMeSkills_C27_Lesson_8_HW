package com.teachmeskills.hw8.doctor.impl;

import com.teachmeskills.hw8.doctor.basedoctor.BaseDoctor;
import com.teachmeskills.hw8.doctor.iheal.IHeal;

/**
 * Class for the therapist doctors type
 * contains field name
 * contains constructor
 * contains required method heal patient with parameter healPlan and method for prescribing a doctor to a patient according to a heal plan.
 */
public class Therapist extends BaseDoctor implements IHeal {
    String name;

    public Therapist(String department, String jobTitle, String name) {
        super(department, jobTitle);
        this.name = name;
    }

    public static IHeal appointADoctor(long healPlan) {
        if (healPlan == 1) {
            return new Surgeon("Surgical department ", "Head of the surgical department ", "Michael");
        } else if (healPlan == 2) {
            return new Dentist("Dental department ", "Head of dental department ", "John");
        } else if (healPlan > 2) {
            return new Therapist("Therapeutic department ", "Head of the therapeutic department ", "Catherine");
        } else {
            return null;
        }
    }

    @Override
    public void heal(long healPlan) {
        System.out.println(super.department);
        System.out.println(super.jobTitle);
        System.out.println("My name is " + this.name);
        System.out.println("I heal like a therapist");
    }
}

