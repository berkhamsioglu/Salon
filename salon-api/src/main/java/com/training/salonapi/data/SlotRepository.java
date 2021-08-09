package com.training.salonapi.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.salonapi.Slot;

@Repository
public interface SlotRepository extends JpaRepository<Slot, Long> {

}
