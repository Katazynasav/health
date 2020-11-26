package com.system.health.models.emergency;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.system.health.models.users.Patient;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@NonNull
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "family_contact")
public class FamilyContact {
    @Id
    @Column(name = "family_contact_id")
    Long familyContactId;

    @Column(name = "family_contact_name")
    String family_contact_name;

    @Column(name = "family_contact_surname")
    String family_contact_surname;

    @Column(name = "family_contact_relation")
    String familyContactRelation;

    @Column(name = "family_contact_number")
    int familyContactNumber;

    @Column(name = "family_contact_email")
    String familyContactEmail;

    @JsonIgnore
    @OneToOne(mappedBy = "familyContact",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    Patient patient;

}
