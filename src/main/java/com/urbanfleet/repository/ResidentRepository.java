package com.urbanfleet.repository;

import com.urbanfleet.model.Resident;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResidentRepository extends JpaRepository<Resident, Integer>
{
}
