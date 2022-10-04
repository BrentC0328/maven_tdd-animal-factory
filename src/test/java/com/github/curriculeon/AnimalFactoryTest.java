package com.github.curriculeon;

import com.github.curriculeon.animals.Cat;
import com.github.curriculeon.animals.Dog;
import com.github.curriculeon.animals.animal_creation.AnimalFactory;
import org.junit.Assert;
import org.junit.Test;

import java.time.Instant;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`


    @Test
    public void createDogTest(){
        //Given
        String expectedName = "Roody Poo McGoo";
        Date expectedBirthDate = Date.from(Instant.ofEpochMilli(2020-02-22));
        //When
        Dog dog = AnimalFactory.createDog(expectedName, expectedBirthDate);
        String actualDogName = dog.getName();
        Date actualBirthDate = dog.getBirthDate();
        //Then
        Assert.assertEquals(expectedName, actualDogName);
        Assert.assertEquals(expectedBirthDate, actualBirthDate);
    }

    @Test
    public void createCatTest(){
        //Given
        String expectedName = "Mr. Bigglesworth";
        Date expectedBirthDate = Date.from(Instant.ofEpochMilli(2020-02-22));
        //When
        Cat cat = AnimalFactory.createCat(expectedName, expectedBirthDate);
        String actualCatName = cat.getName();
        Date actualBirthDate = cat.getBirthDate();
        //Then
        Assert.assertEquals(expectedName, actualCatName);
        Assert.assertEquals(expectedBirthDate, actualBirthDate);
    }

}
