package com.lambdaschool.javazoos.services;

import com.lambdaschool.javazoos.repositories.AnimalRepository;
import com.lambdaschool.javazoos.views.ZooCount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "animalService")
public class AnimalServiceImpl implements AnimalService
{
    @Autowired
    private AnimalRepository animalRepository;

    @Override
    public List<ZooCount> getZooCounts() {
        List<ZooCount> list = animalRepository.getZooCounts();
        return list;
    }
}