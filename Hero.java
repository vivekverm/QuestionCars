package Automobile.TwoWheeler;

import Automobile.Vehicle;

public  abstract class Hero extends Vehicle
{
    public String getModelName()
    {
        return "Hero";
    }
    public String getRegistrationNumber()
    {
        return "1234";
    }
    public String OwnerName()
    {
        return "Vivek kumar";
    }

    public void getSpeed()
    {
        System.out.println("The current speed of the Hero vehicle");
    }
    public void Radio()
    {
        System.out.println("Facility to control the radio device in Hero");
    }
}
