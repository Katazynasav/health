package com.system.health.models.users;

import com.system.health.models.emergency.Incident;
import com.system.health.models.authorisations.Role;
import com.system.health.models.authorisations.Status;
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
    Long employeeId;

    @Column(name = "employee_email")
    String email;

    @Column(name = "employee_name")
    String employeeName;

    @Column(name = "employee_surname")
    String employeeSurname;

    @Column(name = "position")
    String position;

    @Column(name = "password")
    String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    Status status;

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    Role role;

    @ManyToOne
    @JoinColumn(name = "hospital_id")
    Hospital hospital;

    @OneToMany(mappedBy = "employee")
    Set<Incident>incidents;


}
