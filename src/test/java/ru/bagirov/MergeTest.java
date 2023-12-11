package ru.bagirov;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class MergeTest {
    @Test
    public void IntegerLegitShortBothTest() {
        Merge<Integer> merger = new Merge<>();
        List<Integer> l1 = List.of(1,2,3,4);
        List<Integer> l2 = List.of(2, 10);
        List<Integer> actual = merger.mergeLists(l1,l2);

        List<Integer> expected = List.of(1, 2, 2, 3, 4, 10);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void IntegerBothEmpty() {
        Merge<Integer> merger = new Merge<>();

        List<Integer> actual = merger.mergeLists(new ArrayList<Integer>(), new ArrayList<Integer>());

        List<Integer> expected = new ArrayList<>();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void IntegerLeftEmpty() {
        Merge<Integer> merger = new Merge<>();

        List<Integer> actual = merger.mergeLists(new ArrayList<Integer>(), List.of(1, 2));

        List<Integer> expected = List.of(1, 2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void IntegerRightEmpty() {
        Merge<Integer> merger = new Merge<>();

        List<Integer> actual = merger.mergeLists(List.of(-10, -2, 30), new ArrayList<Integer>());

        List<Integer> expected = List.of(-10, -2, 30);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void LongLegitShortBothTest() {
        Merge<Long> merger = new Merge<>();
        List<Long> l1 = List.of(1L,2L,3L,4L);
        List<Long> l2 = List.of(2L, 10L);
        List<Long> actual = merger.mergeLists(l1,l2);

        List<Long> expected = List.of(1L, 2L, 2L, 3L, 4L, 10L);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void LongBothEmpty() {
        Merge<Long> merger = new Merge<>();

        List<Long> actual = merger.mergeLists(new ArrayList<Long>(), new ArrayList<Long>());

        List<Long> expected = new ArrayList<>();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void LongLeftEmpty() {
        Merge<Long> merger = new Merge<>();

        List<Long> actual = merger.mergeLists(new ArrayList<Long>(), List.of(1L, 2L));

        List<Long> expected = List.of(1L, 2L);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void LongRightEmpty() {
        Merge<Long> merger = new Merge<>();

        List<Long> actual = merger.mergeLists(List.of(-10L, -2L, 30L), new ArrayList<Long>());

        List<Long> expected = List.of(-10L, -2L, 30L);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void DoubleLegitShortBothTest() {
        Merge<Double> merger = new Merge<>();
        List<Double> l1 = List.of(1d,2d,3d,4d);
        List<Double> l2 = List.of(2d, 10d);
        List<Double> actual = merger.mergeLists(l1,l2);

        List<Double> expected = List.of(1d, 2d, 2d, 3d, 4d, 10d);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void DoubleBothEmpty() {
        Merge<Double> merger = new Merge<>();

        List<Double> actual = merger.mergeLists(new ArrayList<Double>(), new ArrayList<Double>());

        List<Double> expected = new ArrayList<>();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void DoubleLeftEmpty() {
        Merge<Double> merger = new Merge<>();

        List<Double> actual = merger.mergeLists(new ArrayList<Double>(), List.of(1d, 2d));

        List<Double> expected = List.of(1d, 2d);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void DoubleRightEmpty() {
        Merge<Double> merger = new Merge<>();

        List<Double> actual = merger.mergeLists(List.of(-10d, -2d, 30d), new ArrayList<Double>());

        List<Double> expected = List.of(-10d, -2d, 30d);

        Assert.assertEquals(expected, actual);
    }
}
