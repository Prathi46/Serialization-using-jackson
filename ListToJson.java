package org.Jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.util.*;

public class ListToJson {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper=new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        List<String> progLang=new ArrayList<>();
        progLang.add("C");
        progLang.add("C++");
        progLang.add("Java");
        progLang.add("Python");
        progLang.add(".Net");
        progLang.add("Javascript");

        Map<String,Integer>dates=new HashMap<>();
        dates.put("sun",Calendar.SUNDAY);
        dates.put("mon", Calendar.MONDAY);
        dates.put("tue",Calendar.TUESDAY);
        dates.put("wed",Calendar.WEDNESDAY);
        dates.put("thur",Calendar.THURSDAY);
        dates.put("fri",Calendar.FRIDAY);
        dates.put("sat",Calendar.SATURDAY);

        String json= mapper.writeValueAsString(progLang);
        System.out.println(json);

        String jsson=mapper.writeValueAsString(dates);
        System.out.println(jsson);
    }


}
