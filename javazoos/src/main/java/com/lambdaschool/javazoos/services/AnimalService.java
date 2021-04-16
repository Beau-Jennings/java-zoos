package com.lambdaschool.javazoos.services;

import com.lambdaschool.javazoos.views.ZooCount;

import java.util.List;

public interface AnimalService
{
    List<ZooCount> getZooCounts();
}
