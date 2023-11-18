package ru.netology.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class RadioTest {

    @Test
    public void setCurrentStationBase() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        int actual = radio.getCurrentStationNumber();
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationMore() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.setCurrentStation(12);
        int actual = radio.getCurrentStationNumber();
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationLess() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.setCurrentStation(-5);
        int actual = radio.getCurrentStationNumber();
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextCurrentStationBase() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.next();
        int actual = radio.getCurrentStationNumber();
        int expected = 6;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextCurrentStationAfter9() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.next();
        int actual = radio.getCurrentStationNumber();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevCurrentStationBase() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.prev();
        int actual = radio.getCurrentStationNumber();
        int expected = 4;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevCurrentStationAfter0() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prev();
        int actual = radio.getCurrentStationNumber();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeBase() {
        Radio radio = new Radio();

        radio.setCurrentVolume(26);
        int actual = radio.getCurrentVolume();
        int expected = 26;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeMore() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.setCurrentVolume(120);
        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeLess() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.setCurrentVolume(-45);
        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeBase() {
        Radio radio = new Radio();

        radio.setCurrentVolume(55);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 56;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMore() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeBase() {
        Radio radio = new Radio();

        radio.setCurrentVolume(55);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 54;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeLess() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }


}



