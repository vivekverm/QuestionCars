package Automobile;

import Automobile.TwoWheeler.Hero;
import Automobile.TwoWheeler.Honda;


public abstract class Vehicle {
    public abstract String getModelName();
    public abstract String getRegistrationNumber();
    public abstract String OwnerName();
}
class Test
{
    public static void main(String[] args) {
        Hero obj=new Hero() {
            @Override
            public String getModelName() {
                return super.getModelName();
            }

            @Override
            public String getRegistrationNumber() {
                return super.getRegistrationNumber();
            }

            @Override
            public String OwnerName() {
                return super.OwnerName();
            }

            @Override
            public void getSpeed() {
                super.getSpeed();
            }

            @Override
            public void Radio() {
                super.Radio();
            }
        };
        obj.getModelName();
        obj.getRegistrationNumber();
        obj.OwnerName();
        obj.getSpeed();
        obj.Radio();

           
        Honda obj1=new Honda() {
            @Override
            public String getModelName() {
                return super.getModelName();
            }

            @Override
            public String getRegistrationNumber() {
                return super.getRegistrationNumber();
            }

            @Override
            public String OwnerName() {
                return super.OwnerName();
            }

            @Override
            public void getSpeed() {
                super.getSpeed();
            }

            @Override
            public void cdPlayer() {
                super.cdPlayer();
            }
        };
        obj1.getModelName();
        obj1.getRegistrationNumber();
        obj1.OwnerName();
        obj1.getSpeed();
        obj1.cdPlayer();

    }
}
