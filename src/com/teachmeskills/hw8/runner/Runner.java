package com.teachmeskills.hw8.runner;

import com.teachmeskills.hw8.doctor.iheal.IHeal;
import com.teachmeskills.hw8.doctor.impl.Therapist;
import com.teachmeskills.hw8.patient.Patient;

/**
 * Class with method main to run the program
 * one object have been created: "patient".
 */
public class Runner {
    public static void main(String[] args) {

        Patient patient = new Patient();
        patient.setHealPlan(3);

        IHeal iHeal = Therapist.appointADoctor(patient.getHealPlan());
        if (iHeal != null) {
            iHeal.heal(patient.getHealPlan());
        } else {
            System.out.println("re-Enter. Incorrect heal plan chosen");
        }
    }
}
