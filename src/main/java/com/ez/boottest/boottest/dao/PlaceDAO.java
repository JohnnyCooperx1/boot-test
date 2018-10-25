package com.ez.boottest.boottest.dao;

import com.ez.boottest.boottest.model.Place;
import com.ez.boottest.boottest.repository.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Transient;
import javax.transaction.Transactional;

import java.sql.Timestamp;
import java.util.Date;

@Repository
@Transactional
public class PlaceDAO  {

    @Autowired
    private EntityManager entityManager;


    @Autowired
    PlaceRepository placeRepository;

    public Place getByName(String name){
        return (Place) entityManager.createQuery("from Place where name = :name").setParameter("name",name).getSingleResult();
    }

    public void addNew(String s){
        Place p = new Place();
        p.setName(s);
        p.setDateCreate(new Timestamp(new Date().getTime()));
        placeRepository.save(p);
    }




}
