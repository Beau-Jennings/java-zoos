package com.lambdaschool.javazoos.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "zooanimals")
public class ZooAnimal implements Serializable
{
    @Id
    @ManyToOne
    @JoinColumn(name = "animalid")
    @JsonIgnoreProperties(value = "zoos", allowSetters = true)
    private Animal animal;

    @Id
    @ManyToOne
    @JoinColumn(name = "zooid")
    @JsonIgnoreProperties(value = "animals", allowSetters = true)
    private Zoo zoo;

    private String incomingzoo;

    public ZooAnimal()
    {
    }

    public ZooAnimal(Animal animal, Zoo zoo, String incomingzoo)
    {
        this.animal = animal;
        this.zoo = zoo;
        this.incomingzoo = incomingzoo;
    }

    public Animal getAnimal()
    {
        return animal;
    }

    public void setAnimal(Animal animal)
    {
        this.animal = animal;
    }

    public Zoo getZoo() {
        return zoo;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }

    public String getIncomingzoo() {
        return incomingzoo;
    }

    public void setIncomingzoo(String incomingzoo) {
        this.incomingzoo = incomingzoo;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZooAnimal zooAnimal = (ZooAnimal) o;
        return Objects.equals(animal, zooAnimal.animal) && Objects.equals(zoo, zooAnimal.zoo) && Objects.equals(incomingzoo, zooAnimal.incomingzoo);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(animal, zoo, incomingzoo);
    }
}
