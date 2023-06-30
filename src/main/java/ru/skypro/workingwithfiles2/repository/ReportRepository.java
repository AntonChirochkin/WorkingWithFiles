package ru.skypro.workingwithfiles2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.skypro.workingwithfiles2.department.Report;
@Repository
public interface ReportRepository extends JpaRepository<Report, Integer>{
}
