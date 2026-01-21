package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public interface FinancialAdvisorRepository extends JpaRepository<FinancialAdvisor, Long> {
    List<FinancialAdvisor> findByNameContainingIgnoreCase(String name);
}
