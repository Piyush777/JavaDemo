package org.ust.CreationDesignPattern.BuilderPattern.PizzaBuilder;

public class Pizza {

    private String size;
    private boolean cheese;
    private boolean pepperoni;
    private boolean mushroom;

    private Pizza(Builder builder){
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.pepperoni=builder.pepperoni;
        this.mushroom=builder.mushroom;
    }

    @Override
    public String toString(){
        return "Pizza "+ size +" inch "+
                "Cheese "+ cheese +","+
                "Pepperoni "+ pepperoni +","+
                "Mushroom "+ mushroom ;

    }


    static class Builder {

        private String size;
        private boolean cheese;
        private boolean pepperoni;
        private boolean mushroom;

        public Builder(String size){
            this.size=size;
        }
        public Builder cheese(boolean value){
            cheese=value;
            return this;
        }

        public Builder pepperoni(boolean value){
            pepperoni=value;
            return this;
        }

        public Builder mushroom(boolean value){
            mushroom=value;
            return this;
        }

        public Pizza build(){
            return  new Pizza(this);
        }

    }
}


