package ru.netolgy.domain;

public class Post {
    private int id;
    private LikesInfo likesInfo;
    private CommentsInfo commentsInfo;
    private int NumberOfWatched;
    private String date;
    private ShowFriends showFriends;
    private String nameOfPublic;
    public boolean pinned;
    private ReadFullPost readFullPost;
    private boolean favorite;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public int getNumberOfWatched() {
        return NumberOfWatched;
    }

    public void setNumberOfWatched(int numberOfWatched) {
        NumberOfWatched = numberOfWatched;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ShowFriends getShowFriends() {
        return showFriends;
    }

    public void setShowFriends(ShowFriends showFriends) {
        this.showFriends = showFriends;
    }

    public String getNameOfPublic() {
        return nameOfPublic;
    }

    public void setNameOfPublic(String nameOfPublic) {
        this.nameOfPublic = nameOfPublic;
    }

    public boolean isPinned() {
        return pinned;
    }

    public void setPinned(boolean pinned) {
        this.pinned = pinned;
    }

    public ReadFullPost getReadFullPost() {
        return readFullPost;
    }

    public void setReadFullPost(ReadFullPost readFullPost) {
        this.readFullPost = readFullPost;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}




