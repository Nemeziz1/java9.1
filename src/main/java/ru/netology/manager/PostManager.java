package ru.netology.manager;

public class PostManager {
    private PostManager[] posts;

    public PostManager[] getPosts() {
        return posts;
    }

    public void setPosts(PostManager[] posts) {
        this.posts = posts;
    }

    private int ownerId;
    private String domain;
    private String query;
    private boolean owners_only;
    private int count;
    private int offset;

    public int getOwnerId() {
        return ownerId;
    }
    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getDomain() {
        return domain;
    }
    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getQuery() {
        return query;
    }
    public void setQuery(String query) {
        this.query = query;
    }

    public boolean isOwners_only() {
        return owners_only;
    }
    public void setOwners_only(boolean owners_only) {
        this.owners_only = owners_only;
    }

    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    public int getOffset() {
        return offset;
    }
    public void setOffset(int offset) {
        this.offset = offset;
    }

    public PostManager[] WallSearch(int ownerId, String domain, String query, boolean owners_only, int count,int offset) {
        return null;
    }

    public void WallDelete(int ownerId, String domain, String Query, boolean owners_only, int count, int offset) {
    }
}
