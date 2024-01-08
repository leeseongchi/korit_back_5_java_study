package com.study.ch09;

public class ElectronicDeviceMain {
    public static void main(String[] args) {

        ElectronicDevice[] electronicDevices = new ElectronicDevice[10];

        for(int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i] = i % 2 == 0 ? new Computer() : new SmartPhone();
        }

        System.out.println();

        for (int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i].setPowerOn();
        }

        System.out.println();

        for (int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i].showDeviceState();
        }

        for (int i = 0; i < electronicDevices.length; i++) {
            if(electronicDevices[i] instanceof Computer) {
                Computer computer = (Computer) electronicDevices[i];
                computer.playGame();
            } else if(electronicDevices[i] instanceof SmartPhone) {
                SmartPhone smartPhone = (SmartPhone) electronicDevices[i];
                smartPhone.call();
            }
        }


    }
}
