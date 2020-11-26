package com.system.health.models.users;


import com.system.health.models.emergency.Incident;
import com.system.health.models.emergency.EmergencyInfo;
import com.system.health.models.emergency.FamilyContact;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Set;

@Data
@NonNull
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults (level = AccessLevel.PRIVATE)
@Table (name = "patient")
public class Patient {
    @Id
    @Column(name = "patient_id", unique = true, nullable = false)
    Long patientId;

    @Column(name = "patient_name")
    String patientName;

    @Column(name = "patient_surname")
    String patientSurname;

    @Column(name = "patient_birth_date")
    String patientBirthDate;

    @Column(name = "patient_email")
    String patientEmail;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "family_contact")
    FamilyContact familyContact;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "emergency_info_id")
    EmergencyInfo emergencyInfo;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "patient_id")
    Set <Incident> incidents;




}
