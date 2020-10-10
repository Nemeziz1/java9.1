package ru.netolgy.domain;

public class LikesInfo {
    public int count;
    public boolean canLike;
    
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean getLike() {
        return canLike;
    }

    public void setLike(boolean like) {
        this.canLike = like;
    }
}
