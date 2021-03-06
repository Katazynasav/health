package com.system.health.models.users;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.system.health.models.emergency.Incident;
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
@Table(name = "hospital")
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "hospital_id",unique = true,nullable = false)
    Long hospitalId;

    @Column(name = "hospital_name")
    String hospitalName;

    @Column(name = "hospital_city")
    String hospitalCity;

    @Column(name = "hospital_address")
    String hospitalAddress;

    @JsonIgnore
    @OneToMany(mappedBy = "hospital")
    Set<Employee> employees;

    @JsonIgnore
    @OneToMany(mappedBy = "hospital")
    Set<Incident> incidents;

}
