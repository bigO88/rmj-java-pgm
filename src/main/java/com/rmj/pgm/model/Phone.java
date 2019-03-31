package com.rmj.pgm.model;

public class Phone implements Comparable<Phone> {

    String  model;
    long price;
    int rating;

    public Phone() {
    }

    public Phone(String model, long price, int rating) {
        this.model = model;
        this.price = price;
        this.rating = rating;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }


    @Override
    public int compareTo(Phone phone) {
        if(this.rating < phone.rating)
            return 1;
        else
            return -1;

    }
}
