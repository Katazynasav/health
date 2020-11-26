package com.system.health.models.emergency;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.system.health.models.users.Patient;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;


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

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "emergency_info_disease",
            joinColumns = {@JoinColumn(name = "emergency_info_id", referencedColumnName = "emergency_info_id")},
            inverseJoinColumns = {@JoinColumn(name = "disease_id", referencedColumnName = "disease_id")})
    private List<Disease> disease;

    @Column(name = "medicines")
    String medicines;

    @JsonIgnore
    @OneToOne(mappedBy = "emergencyInfo",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    Patient patient;

}
