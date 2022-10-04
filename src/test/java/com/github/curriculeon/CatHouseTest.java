package com.github.curriculeon;

import com.github.curriculeon.animals.animal_creation.AnimalFactory;
import com.github.curriculeon.animals.animal_storage.CatHouse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.github.curriculeon.animals.Animal;
import com.github.curriculeon.animals.Cat;
import com.github.curriculeon.animals.Mammal;

import java.util.ArrayList;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Before
    public void setup(){
        CatHouse.clear();
    }

    @Test
    public void removeCatTest(){
        //Given (cat is added)
        Integer expectedId = 7;
        Cat expectedCat = new Cat(null, null, expectedId);
        CatHouse.add(expectedCat);
        Cat actualCat = CatHouse.getCatById(expectedId);
        Assert.assertEquals(expectedCat, actualCat);

        //When (Cat is removed, check removed Id)
        CatHouse.remove(expectedCat);
        actualCat = CatHouse.getCatById(expectedId);

        //Then (Check if the cat is not there(null))
        Assert.assertNull(actualCat);

    }

    @Test
    public void removeCatByIntegerIdTest(){
        //Given (cat is added)
        Integer expectedId = 9;
        Cat expectedCatTwo = new Cat(null, null, expectedId);
        CatHouse.add(expectedCatTwo);
        Cat actualCat = CatHouse.getCatById(expectedId);
        Assert.assertEquals(expectedCatTwo, actualCat);

        //When (Cat is removed, check removed Id)
        CatHouse.remove(CatHouse.getCatById(expectedId));
        actualCat = CatHouse.getCatById(expectedId);

        //Then (Check if the cat is not there(null))
        Assert.assertNull(actualCat);

    }


    @Test
    public void getCatByIdTest1(){
        //Given (empty cathouse)
        Integer expectedId = 0;
        Cat expectedCat = new Cat(null, null, expectedId);

        //When (cat is added to cathouse. Find the cat in the CatHouse)
        CatHouse.add(expectedCat);
        Cat actualCat = CatHouse.getCatById(expectedId);

        //Then (check the house and retrieve the cat somehow)
        Assert.assertEquals(expectedCat, actualCat);




    }
    @Test
    public void getCatByIdTest2(){
        //Given (empty cathouse)
        Cat expectedCat = new Cat("Doug", null, 28);

        //When (cat is added to cathouse. Find the cat in the CatHouse)
        CatHouse.add(expectedCat);
        Cat actualCat = CatHouse.getCatById(28);

        //Then (check the house and retrieve the cat somehow)
        Assert.assertEquals(expectedCat, actualCat);




    }

    @Test
    public void getNumberOfCatsTest(){
        //Given
        Integer expectedId = 10;
        Cat expectedCat = new Cat(null, null, expectedId);
        CatHouse.add(expectedCat);
        Integer expectedCatAmount = CatHouse.getNumberOfCats();
        //When
        Cat secondCat = new Cat(null, null, null);
        CatHouse.add(secondCat);
        Integer actualCatAmount = CatHouse.getNumberOfCats();
        expectedCatAmount += 1;
        //Then
        Assert.assertEquals(expectedCatAmount, actualCatAmount);
    }




}

