package com.system.health.models.emergency;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.system.health.models.users.Employee;
import com.system.health.models.users.Hospital;
import com.system.health.models.users.Patient;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

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

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "patient_id")
    Patient patient;

    @ManyToOne()
    @JoinColumn(name = "employee_id")
    Employee employee;
}
