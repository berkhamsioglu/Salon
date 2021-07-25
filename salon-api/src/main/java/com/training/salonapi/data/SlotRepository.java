package com.training.salonapi.data;

import org.springframework.data.repository.CrudRepository;

import com.training.salonapi.Slot;

public interface SlotRepository extends CrudRepository<Slot, String> {

}
