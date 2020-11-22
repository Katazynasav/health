package com.system.health.models;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Set;

@Data
@NonNull
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employee_id",unique = true,nullable = false)
    Long employeeId;

    @Column(name = "employee_name")
    String employeeName;

    @Column(name = "employee_surname")
    String employeeSurname;

    @Column(name = "status")
    String status;

    @ManyToOne
    @JoinColumn(name = "hospital_id")
    Hospital hospital;

    @OneToMany(mappedBy = "employee")
    Set<Incident>incidents;


}
