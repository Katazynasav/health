package com.system.health.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @GeneratedValue
    @Column(name = "employee_id",unique = true,nullable = false)
    Long employeeId = (long) Math.floor(Math.random() * 9000000000L);

    @Column(name = "employee_name")
    String employeeName;

    @Column(name = "employee_surname")
    String employeeSurname;

    @Column(name = "status")
    String status;

    @Column(name = "password")
    String password;

    @ManyToOne
    @JoinColumn(name = "hospital_id")
    Hospital hospital;

    @OneToMany(mappedBy = "employee")
    Set<Incident>incidents;


}
