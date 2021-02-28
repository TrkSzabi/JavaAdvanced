package oop.nestedclasses;

public class Becycle {
    private Integer maxSpeed = 100;

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public class Wheel {
        public void repair() {
            maxSpeed+=10;
        }
    }

    public static class Mechanic {
        public void damage(Becycle becycle) {
            becycle.maxSpeed-=50;
        }

    }
}
