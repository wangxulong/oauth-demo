package com.example.oauthdemo;

import lombok.extern.slf4j.Slf4j;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ObjectNode;
import org.junit.jupiter.api.Test;

import java.io.IOException;

/**
 * 描述
 *
 * @author wangxulong
 * @version 20200428
 */
@Slf4j
public class MainTest {
    @Test
    public void testOn3() throws IOException {
        String fireds = "[{\"name\":\"wxl\",\"age\":[1,2,3]},{\"name\":\"wxl\",\"age\":[1,2,3]}]";
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(fireds);
        ObjectNode objectNode = objectMapper.createObjectNode();
        objectNode.put("name","王旭龙");
        objectNode.put("age",20);
        objectNode.put("firends",jsonNode);

       String msg = "{\"name\":\"王旭龙\",\"age\":20,\"firends\":[{\"name\":\"wxl\",\"age\":[1,2,3]},{\"name\":\"wxl\",\"age\":[1,2,3]}]}";
       log.info("msg:{}",objectMapper.readTree(msg));

        log.info(objectMapper.writeValueAsString(objectNode));

       // log.info("123");
    }
}
