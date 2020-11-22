package com.system.health.models;

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

    @OneToOne(mappedBy = "familyContact",fetch = FetchType.EAGER)
    Patient patient;

}
