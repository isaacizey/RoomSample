package com.kyalo.isaac.roomsample;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void addTwoNumbersFloats() {
        double resultAdd = MainActivity.add(1.111f, 1.111d);
        assertThat(resultAdd, is(equalTo(2.2219999418258665d)));
    }

    @Test public void addTwoInts(){
        double resultsAdd = MainActivity.add(342d , 4d);
        assertThat(resultsAdd, is(equalTo(346d)));
    }

    @Test
    public void addNegatives()
    {
        double resultNegs = MainActivity.add(-76d,80d);
        assertThat(resultNegs, is(equalTo(4d)));
    }

    @Test
    public void itemsOnAdapter()
    {
        int adapterList = MainActivity.displayedItems();
        int datasize = WordListAdapter.itemsize();

        assertThat(adapterList,is(equalTo(datasize)));
    }

}