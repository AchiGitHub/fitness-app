package com.lifestyleservice.lifestyle.repository;

import com.lifestyleservice.lifestyle.entity.MembershipType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembershipRepository extends JpaRepository<MembershipType, Long> {
}
