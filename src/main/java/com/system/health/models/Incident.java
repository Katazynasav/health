package com.system.health.models;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "incident")
public class Incident {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "incident_id",unique = true,nullable = false)
    Long incidentId;

    @ManyToOne
    @JoinColumn(name = "hospital_id")
    Hospital hospital;

    @Column(name = "incident_description")
    String incidentDescription;

    @Column(name = "incident_date")
    String incidentDate;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "patient_id")
    Patient patient;

    @ManyToOne()
    @JoinColumn(name = "employee_id")
    Employee employee;
}
