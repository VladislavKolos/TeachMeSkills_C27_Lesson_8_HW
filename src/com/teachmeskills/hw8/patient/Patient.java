package com.teachmeskills.hw8.patient;

import com.teachmeskills.hw8.doctor.basedoctor.BaseDoctor;

/**
 * Class for the patient type
 * contains fields healPlan and doctor
 * contains getters and setters for fields healPlan and doctor.
 */
public class Patient {
    private long healPlan;
    private BaseDoctor doctor;

    public long getHealPlan() {
        return healPlan;
    }

    public void setHealPlan(long healPlan) {
        this.healPlan = healPlan;

    }

    public BaseDoctor getDoctor() {
        return doctor;
    }

    public void setDoctor(BaseDoctor doctor) {
        this.doctor = doctor;
    }
}
