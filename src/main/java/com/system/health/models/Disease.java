package com.system.health.models;

import lombok.*;
import lombok.experimental.FieldDefaults;


import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "disease")
public class Disease {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "disease_id",unique = true,nullable = false)
    Long disease_id;

    @Column(name = "disease_name")
    String diseaseName;

    @Column(name = "disease_type")
    String diseaseType;

    @Column(name = "disease_description")
    String diseaseDescription;

    @OneToMany(mappedBy = "disease",fetch = FetchType.EAGER)
    Set <EmergencyInfo> emergencyInfos;



}
