package com.training.salonapi;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class Slot {

	public Slot() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToMany(fetch = FetchType.EAGER)
	@JsonIgnore
	Set<SalonServiceDetail> availableServices;

	@ManyToOne
	private SalonServiceDetail selectedService;

	String stylistName;

	LocalDateTime slotFor;

	private SlotStatus status;

	LocalDateTime lockedAt;
	LocalDateTime confirmedAt;

}

enum SlotStatus {
	AVAILABLE, LOCKED, CONFIRMED, CANCELLED
}
