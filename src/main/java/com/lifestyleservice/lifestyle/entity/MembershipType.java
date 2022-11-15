package com.lifestyleservice.lifestyle.entity;

import com.lifestyleservice.lifestyle.enums.DurationType;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "membershipType")
public class MembershipType extends Auditable<String> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private String membershipName;
    @NotNull
    private Long price;
    @NotNull
    private Long numberOfMembers;
    @NotNull
    private Long durationId;
}
