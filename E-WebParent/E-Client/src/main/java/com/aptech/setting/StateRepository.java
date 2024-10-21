package com.aptech.setting;

import java.util.List;

import com.aptech.common.entity.State;
import org.springframework.data.repository.CrudRepository;

import com.aptech.common.entity.Country;

public interface StateRepository extends CrudRepository<State, Integer> {
	
	public List<State> findByCountryOrderByNameAsc(Country country);
}
