package org.Jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonIgnore {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper=new ObjectMapper();
        User user=new User(1,"James","Bond");
        String DtoAsString=mapper.writeValueAsString(user);
        System.out.println(DtoAsString);
    }
}
