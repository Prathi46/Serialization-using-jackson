package org.Jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class PojoToJson {
    public static void main(String[] args) throws IOException {

        //create object mapper
        ObjectMapper mapper=new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        //post
        Post post=new Post();
        post.setId(1);
        post.setTitle("Jackson");
        post.setDescription("Pojo class to Json");
        post.setContent("Content here");
        post.setPostedAt(new Date());
        post.setLastUpdatedAt(new Date());

        //tags
        Set<Tag>tags=new HashSet<>();
        Tag java=new Tag(100,"Java");
        Tag jackson=new Tag(101,"Jackson");
        Tag json=new Tag(102,"Json");
        tags.add(java);
        tags.add(jackson);
        tags.add(json);
        post.setTags(tags);

        //Convert object to Json string
        String postJson= mapper.writeValueAsString(post);
        System.out.println(postJson);

        //Converting object to Json file
        FileOutputStream fileOutputStream=new FileOutputStream("post.json");
        mapper.writeValue(fileOutputStream,post);
        fileOutputStream.close();
    }
}
