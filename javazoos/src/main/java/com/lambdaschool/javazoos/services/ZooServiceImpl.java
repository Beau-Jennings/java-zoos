package com.lambdaschool.javazoos.services;

import com.lambdaschool.javazoos.models.Zoo;
import com.lambdaschool.javazoos.repositories.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "zooService")
public class ZooServiceImpl implements ZooService
{
    private ZooRepository zooRepository;

    @Override
    public List<Zoo> getAllZoos()
    {
        List<Zoo> zoos = new ArrayList<>();
        zooRepository.findAll().iterator().forEachRemaining(zoos::add);
        return zoos;
    }

    @Override
    public Zoo getZooById(long id)
            throws EntityNotFoundException
    {
        return zooRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Zoo Id" + id + " Not Found!"));
    }
}

