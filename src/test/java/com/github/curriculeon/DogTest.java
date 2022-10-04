package com.github.curriculeon;

import com.github.curriculeon.animals.Animal;
import com.github.curriculeon.animals.Mammal;
import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.animals.Dog;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void dogConstructorTest(){
        //Given
        String expectedName = "Dogster McDog";
        Date expectedbirthDate = Date.from(Instant.now());
        Integer expectedID = 69; //nice
        Dog dog = new Dog(expectedName, expectedbirthDate, expectedID);

        //When
        String actualName = dog.getName();
        Date actualDate = dog.getBirthDate();
        Integer actualID = dog.getId();

        //Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedbirthDate, actualDate);
        Assert.assertEquals(expectedID, actualID);
    }


    @Test
    public void dogSpeakTest() {
        //Given
        Dog dog = new Dog(null, null, null);
        String expectedSpeak = "bark!";
        //When
        String actualSpeak = dog.speak();
        //Then
        Assert.assertEquals(expectedSpeak, actualSpeak);
    }

    @Test
    public void dogBirthDateTest() {
        //Given
        Dog dog = new Dog(null, null, null);
        Date expectedBirthDate = Date.from(Instant.now());
        //When
        dog.setBirthDate(expectedBirthDate);
        Date actualBirthDate = dog.getBirthDate();
        //Then
        Assert.assertEquals(expectedBirthDate, actualBirthDate);

    }

    @Test
    public void dogEatTest() {

        //Given
        Dog dog = new Dog(null, null, null);
        ArrayList<Food> testFood = new ArrayList<>(0);

        //When
        Food food = new Food();
        dog.eat(food);
        testFood.add(food);
        Integer actualMeals = dog.getNumberOfMealsEaten();
        Integer expectedMeals = testFood.size();

        //Then
        Assert.assertEquals( expectedMeals, actualMeals);
    }

    @Test
    public void testDogID(){
        //Given
        Dog dog = new Dog(null, null, 23);
        Integer expectedID = 23;
        //When
        Integer actualID = dog.getId();
        //Then
        Assert.assertEquals(expectedID, actualID);

    }

    @Test
    public void dogAnimalInheritanceTest(){
        //Given
        Dog dog = new Dog(null,null,null);
        //Then
        Assert.assertTrue(dog instanceof Animal);
    }

    @Test
    public void dogMammalInheritanceTest(){
        //Given
        Dog dog = new Dog(null,null,null);
        //Then
        Assert.assertTrue(dog instanceof Mammal);
    }

}


