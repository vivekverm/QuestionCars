package Automobile.TwoWheeler;

import Automobile.Vehicle;

abstract public class Honda extends Vehicle
{

        public String getModelName()
        {
            return "Honda";
        }
        public String getRegistrationNumber()
        {
            return "456";
        }
        public String OwnerName()
        {
            return "Bhaiya";
        }
        public void getSpeed()
        {
            System.out.println("The current speed of Honda vehicles");
        }
        public void cdPlayer()
        {
            System.out.println("Facility to control cd player in Honda");
        }
}

