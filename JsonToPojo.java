package org.Jackson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

public class JsonToPojo {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        //Read json file and convert to Java object
        InputStream fileInputStream=new FileInputStream("post.json");
        Post post = mapper.readValue(fileInputStream, Post.class);
        fileInputStream.close();

        //Printing post details
        System.out.println("Printing post details");
        System.out.println(post.getId());
        System.out.println(post.getTitle());
        System.out.println(post.getContent());
        System.out.println(post.getDescription());
        System.out.println(post.getPostedAt());
        System.out.println(post.getLastUpdatedAt());

        //printing tags of the post
        System.out.println("Printing tags::"+post.getTags());
        for (Iterator<Tag>iterator=post.getTags().iterator(); iterator.hasNext();){
            Tag tag=(Tag) iterator.next();
            System.out.println(tag.getId());
            System.out.println(tag.getName());
        }

    }
}