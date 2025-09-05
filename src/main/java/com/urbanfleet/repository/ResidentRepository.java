package com.urbanfleet.repository;

import com.urbanfleet.model.Resident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ResidentRepository extends JpaRepository<Resident, Integer>
{
    List<Resident> findByFnameIgnoreCaseOrLnameIgnoreCase( String fname, String lname);
    List<Resident> findByFnameIgnoreCase(String Fname);
    List<Resident> findByLnameIgnoreCase(String Lname);
}
