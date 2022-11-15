package com.lifestyleservice.lifestyle.service;

import com.lifestyleservice.lifestyle.entity.MembershipType;
import com.lifestyleservice.lifestyle.util.TransportDto;

public interface MembershipTypeService {
    TransportDto createMembershipType(MembershipType membershipType);
    TransportDto getAllMembershipTypes();
    boolean deleteMembershipType(Long id);
    TransportDto updateMembershipType(Long id, MembershipType membershipType);
}
