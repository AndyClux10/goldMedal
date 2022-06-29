package com.codecademy.goldmedal.repository;

import org.springframework.data.repository.CrudRepository;
import com.codecademy.goldmedal.model.Country;
import java.util.Optional;
import java.util.List;

public interface CountryRepository extends CrudRepository <Country, Integer>{
    Optional<Country> getByName(String name);
    List<Country> getAllByOrderByNameAsc();
    List<Country> getAllByOrderByNameDesc();
    List<Country> getAllByOrderByGdpAsc();
    List<Country> getAllByOrderByGdpDesc();
    List<Country> getAllByOrderByPopulationAsc();
    List<Country> getAllByOrderByPopulationDesc();

}
