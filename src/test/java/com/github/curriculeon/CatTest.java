package com.github.curriculeon;

import com.github.curriculeon.animals.Animal;
import com.github.curriculeon.animals.Cat;
import com.github.curriculeon.animals.Mammal;
import org.junit.Assert;
import org.junit.Test;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void testSetName(){
        //Given
        Cat cat = new Cat(null, null, null);
        String theName = "Catastrophe";
        //When
        cat.setName(theName);
        //Then
        String catName = cat.getName();
        Assert.assertEquals(catName, theName);
    }
    @Test
    public void testCatSpeak(){
        //Given
        Cat cat = new Cat(null, null, null);
        String theCatSays = "meow!";
        //When
        String heSaid = cat.speak();
        //Then
        Assert.assertEquals(theCatSays, heSaid);
    }
    @Test
    public void testSetBirthdate(){
        //Given
        Cat cat = new Cat(null, null, null);
        //When
        Date happyBirthday = Date.from(Instant.now());
        cat.setBirthDate(happyBirthday);
        //Then
        Date catsBirthday = cat.getBirthDate();
        Assert.assertEquals(catsBirthday, happyBirthday);
    }
    @Test
    public void testCatEat(){
        //Given
        Cat cat = new Cat(null, null, null);
        ArrayList <Food> testFood = new ArrayList<>(0);

        //When
        Food food = new Food();
        cat.eat(food);
        testFood.add(food);
        Integer eatenMeals = cat.getNumberOfMealsEaten();
        Integer testMeals = testFood.size();

        //Then
        Assert.assertEquals(eatenMeals, testMeals);
    }

    @Test
    public void catIDTest(){
        //Given
        Cat cat = new Cat(null, null, 16);
        Integer testIDNumber = 16;
        //When
        Integer catID = cat.getId();
        //Then
        Assert.assertEquals(testIDNumber, catID);
    }

    @Test
    public void animalInheritanceTest(){
        //Given
        //When
        Cat cat = new Cat(null,null,null);
        //Then
        Assert.assertTrue(cat instanceof Animal);
    }
    @Test
    public void mammalInheritanceTest(){
        //Given
        //When
        Cat cat = new Cat(null,null,null);
        //Then
        Assert.assertTrue(cat instanceof Mammal);
    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
