package com.github.curriculeon;

import com.github.curriculeon.animals.Cat;
import com.github.curriculeon.animals.Dog;
import com.github.curriculeon.animals.animal_creation.AnimalFactory;
import com.github.curriculeon.animals.animal_storage.CatHouse;
import com.github.curriculeon.animals.animal_storage.DogHouse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Before
    public void setup(){
        DogHouse.clear();
    }
    @Test
    public void getDogByIdTest(){
        //Given
        Integer expectedId = 3;
        Dog expectedDog = new Dog("Spot", null, expectedId);
        //When
        DogHouse.add(expectedDog);
        Dog actualDog = DogHouse.getDogById(expectedId);
        //Then
        Assert.assertEquals(expectedDog, actualDog);
    }
    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void removeDogTest(){
        //Given
        Integer expectedId = 3;
        Dog expectedDog = new Dog("Spot", null, expectedId);
        DogHouse.add(expectedDog);
        Dog actualDog = DogHouse.getDogById(expectedId);
        Assert.assertEquals(expectedDog, actualDog);
        //When
        DogHouse.remove(expectedDog);
        actualDog = DogHouse.getDogById(expectedId);
        //Then
        Assert.assertNull(actualDog);
    }
    @Test
    public void removeDogByIdTest(){
        //Given
        Integer expectedId = 3;
        Dog expectedDog = new Dog("Spot", null, expectedId);
        DogHouse.add(expectedDog);
        Dog actualDog = DogHouse.getDogById(expectedId);
        Assert.assertEquals(expectedDog, actualDog);
        //When
        DogHouse.remove(DogHouse.getDogById(expectedId));
        actualDog = DogHouse.getDogById(expectedId);
        //Then
        Assert.assertNull(actualDog);

    }
}
