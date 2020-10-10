package ru.netolgy.domain;

public class ReadFullPost {
    private int id;
    private boolean canClose;
    private String text;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isClose() {
        return canClose;
    }

    public void setClose(boolean close) {
        this.canClose = close;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
