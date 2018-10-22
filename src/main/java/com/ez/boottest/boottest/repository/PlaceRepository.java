package com.ez.boottest.boottest.repository;

import com.ez.boottest.boottest.model.Place;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  PlaceRepository extends CrudRepository<Place, Long> {



}
