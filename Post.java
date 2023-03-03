package org.Jackson;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Post {
   private int id;
   private String title;
   private String description;
   private String content;
   private Date postedAt=new Date();
   private Date lastUpdatedAt=new Date();
   private Set<Tag>tags=new HashSet<>();

    public Post() {
    }

    public Post(int id, String title, String description, String content, Date postedAt, Date lasUpdatedAt, HashSet<Tag> tags) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.content = content;
        this.postedAt = postedAt;
        this.lastUpdatedAt = lasUpdatedAt;
        this.tags = tags;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPostedAt() {
        return postedAt;
    }

    public void setPostedAt(Date postedAt) {
        this.postedAt = postedAt;
    }

    public Date getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    public void setLastUpdatedAt(Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }
}