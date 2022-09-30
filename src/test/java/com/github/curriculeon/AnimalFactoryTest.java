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
        String testName = "Roody Poo McGoo";
        Date testBirthDate = Date.from(Instant.ofEpochMilli(2020-02-22));
        //When
        Dog dog = AnimalFactory.createDog(testName, testBirthDate);
        String checkedDogName = dog.getName();
        Date checkedBirthDate = dog.getBirthDate();
        //Then
        Assert.assertEquals(testName, checkedDogName);
        Assert.assertEquals(testBirthDate, checkedBirthDate);
    }

    @Test
    public void createCatTest(){
        //Given
        String testName = "Mr. Bigglesworth";
        Date testBirthDate = Date.from(Instant.ofEpochMilli(2020-02-22));
        //When
        Cat cat = AnimalFactory.createCat(testName, testBirthDate);
        String checkedCatName = cat.getName();
        Date checkedBirthDate = cat.getBirthDate();
        //Then
        Assert.assertEquals(testName, checkedCatName);
        Assert.assertEquals(testBirthDate, checkedBirthDate);
    }

}
