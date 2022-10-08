package tda.darkarmy.onlinecrimereportingportal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import tda.darkarmy.onlinecrimereportingportal.model.ReportCrime;

public interface ReportCrimeRepository extends JpaRepository<ReportCrime, Long>{

  List<ReportCrime> findByEmail(String email);
  ReportCrime findByCaseNumber(String number);
    
}
