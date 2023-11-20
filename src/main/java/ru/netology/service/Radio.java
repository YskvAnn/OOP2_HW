package ru.netology.service;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int stationNumber = 10;

    public Radio(int stationNumber) {
        this.stationNumber = stationNumber;
    }
    public Radio() {
    }
   public int getCurrentStationNumber() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > stationNumber - 1) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void next() {
        if (currentStation == stationNumber - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = stationNumber - 1;
        } else {
            currentStation--;

        }
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 100) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }

            this.currentVolume = currentVolume;
        }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}



