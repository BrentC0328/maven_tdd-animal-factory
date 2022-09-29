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
        String testName = "Dogster McDog";
        Date testbirthDate = Date.from(Instant.now());
        Integer testID = 69; //nice
        Dog dog = new Dog(testName, testbirthDate, testID);

        //When
        String checkedName = dog.getName();
        Date checkedDate = dog.getBirthDate();
        Integer checkedID = dog.getId();

        //Then
        Assert.assertEquals(testName, checkedName);
        Assert.assertEquals(testbirthDate, checkedDate);
        Assert.assertEquals(testID, checkedID);
    }


    @Test
    public void dogSpeakTest() {
        //Given
        Dog dog = new Dog(null, null, null);
        String theDogSays = "bark!";
        //When
        String whatHeSaid = dog.speak();
        //Then
        Assert.assertEquals(theDogSays, whatHeSaid);
    }

    @Test
    public void dogBirthDateTest() {
        //Given
        Dog dog = new Dog(null, null, null);
        Date happyBirthday = Date.from(Instant.now());
        //When
        dog.setBirthDate(happyBirthday);
        Date getTheBirthDate = dog.getBirthDate();
        //Then
        Assert.assertEquals(happyBirthday, getTheBirthDate);

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
        Integer eatenMeals = dog.getNumberOfMealsEaten();
        Integer testMeals = testFood.size();

        //Then
        Assert.assertEquals(eatenMeals, testMeals);
    }

    @Test
    public void testDogID(){
        //Given
        Dog dog = new Dog(null, null, 23);
        Integer testDogID = 23;
        //When
        Integer checkedID = dog.getId();
        //Then
        Assert.assertEquals(testDogID, checkedID);

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


