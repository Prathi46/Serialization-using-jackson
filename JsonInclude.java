package org.Jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JsonInclude {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper=new ObjectMapper();
        mapper.setSerializationInclusion(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL);
        mapper.setSerializationInclusion(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY);
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        Employee employee=new Employee(1,null," ");
        String result= mapper.writeValueAsString(employee);
        System.out.println(result);
    }
}