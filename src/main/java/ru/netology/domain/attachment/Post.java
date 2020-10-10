package ru.netology.domain.attachment;

import java.lang.reflect.Array;

public class Post {

    private boolean photo;
    private boolean postedPhoto;
    private String video;
    private String audio;
    private String doc;
    private boolean graffiti;
    private String link;
    private String note;
    private boolean app;
    private String poll;
    private String page;
    private String album;
    private Array photosList;
    private boolean market;
    private boolean marketAlbum;
    private boolean sticker;
    private Array cards;
    private String event;

    public boolean isPhoto() {
        return photo;
    }
    public void setPhoto(boolean photo) {
        this.photo = photo;
    }

    public boolean isPostedPhoto() {
        return postedPhoto;
    }
    public void setPostedPhoto(boolean postedPhoto) {
        this.postedPhoto = postedPhoto;
    }

    public String getVideo() {
        return video;
    }
    public void setVideo(String video) {
        this.video = video;
    }

    public String getAudio() {
        return audio;
    }
    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getDoc() {
        return doc;
    }
    public void setDoc(String doc) {
        this.doc = doc;
    }

    public boolean isGraffiti() {
        return graffiti;
    }
    public void setGraffiti(boolean graffiti) {
        this.graffiti = graffiti;
    }

    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }

    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }

    public boolean isApp() {
        return app;
    }
    public void setApp(boolean app) {
        this.app = app;
    }

    public String getPoll() {
        return poll;
    }
    public void setPoll(String poll) {
        this.poll = poll;
    }

    public String getPage() {
        return page;
    }
    public void setPage(String page) {
        this.page = page;
    }

    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }

    public Array getPhotos_list() {
        return photosList;
    }
    public void setPhotos_list(Array photos_list) {
        this.photosList = photos_list;
    }

    public boolean isMarket() {
        return market;
    }
    public void setMarket(boolean market) {
        this.market = market;
    }

    public boolean isMarket_album() {
        return marketAlbum;
    }
    public void setMarket_album(boolean market_album) {
        this.marketAlbum = market_album;
    }

    public boolean isSticker() {
        return sticker;
    }
    public void setSticker(boolean sticker) {
        this.sticker = sticker;
    }

    public Array getCards() {
        return cards;
    }
    public void setCards(Array cards) {
        this.cards = cards;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }
}
