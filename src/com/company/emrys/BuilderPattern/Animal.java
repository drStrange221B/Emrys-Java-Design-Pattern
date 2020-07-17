package com.company.emrys.BuilderPattern;

public class Animal {

    private String name;
    private Type type;
    private int speed;
    private String food;
    private int averageLive;

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public int getSpeed() {
        return speed;
    }

    public String getFood() {
        return food;
    }

    public int getAverageLive() {
        return averageLive;
    }

    public Animal(AnimalBuilder animalBuilder) {
        this.name = animalBuilder.name;
        this.type = animalBuilder.type;
        this.speed = animalBuilder.speed;
        this.food = animalBuilder.food;
        this.averageLive = animalBuilder.averageLive;
    }

    public static class AnimalBuilder{

        private String name;
        private Type type;
        private int speed;
        private String food;
        private int averageLive;

        public AnimalBuilder() {

        }

        public  AnimalBuilder name(String name){
           this.name=name;
           return this;
        }

        public  AnimalBuilder type(Type type)
        {
            this.type=type;
            return this;
        }

        public  AnimalBuilder speed(int speed){
            this.speed = speed;
            return this;
        }

        public AnimalBuilder food(String food){
            this.food= food;
            return this;
        }
        public AnimalBuilder averageLive(int averageLive)
        {
            this.averageLive=averageLive;
            return this;
        }

        public Animal build()
        {
            return new Animal(this);
        }
    }



}
