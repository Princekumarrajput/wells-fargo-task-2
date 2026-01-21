package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public interface FinancialAdvisorRepository extends JpaRepository<FinancialAdvisor, Long> {
    List<FinancialAdvisor> findByNameContainingIgnoreCase(String name);
}
public interface ClientRepository extends JpaRepository<Client, Long> {
    List<Client> findByFinancialAdvisor_AdvisorId(Long advisorId);
}
public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {
    Portfolio findByClient_ClientId(Long clientId);
}
public interface SecurityRepository extends JpaRepository<Security, Long> {
    List<Security> findByPortfolio_PortfolioId(Long portfolioId);
}
