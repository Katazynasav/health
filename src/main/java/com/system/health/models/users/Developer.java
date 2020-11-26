package com.system.health.models.users;

import com.system.health.models.authorisations.Role;
import com.system.health.models.authorisations.Status;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "developer")
public class Developer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "developer_id")
    Long developerId;

    @Column(name = "developer_name")
    String developerName;

    @Column(name = "developer_surname")
    String developerSurname;

    @Column(name = "password")
    String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    Status status;

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    Role role;

}
