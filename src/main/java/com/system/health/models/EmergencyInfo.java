package com.system.health.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;



@Data
@NonNull
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "emergency_info")
public class EmergencyInfo {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "emergency_info_id",unique = true,nullable = false)
    Long emergencyInfoId;

    @Column(name = "blood_type")
    String bloodType;

    @ManyToOne
    @JoinColumn(name = "disease_id")
    Disease disease;

    @Column(name = "medicines")
    String medicines;

    @JsonIgnore
    @OneToOne(mappedBy = "emergencyInfo",fetch = FetchType.EAGER)
    Patient patient;

}
