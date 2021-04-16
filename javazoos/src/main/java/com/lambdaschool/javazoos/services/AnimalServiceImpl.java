package com.lambdaschool.javazoos.services;

import com.lambdaschool.javazoos.repositories.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "animalService")
public class AnimalServiceImpl implements AnimalService
{
    @Autowired
    private AnimalRepository animalRepository;

    @Override
    public List<ZooCount> getZooCounts
    {
        List<ZooCount> zooCountList = animalRepository.getZooCounts();
        return zooCountList;
    }
}
