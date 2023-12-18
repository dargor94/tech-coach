package org.gl.masera.techcoach.util.data.log;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Slf4j
@Component
public class JsonXmlDataLoggerAdapter implements XmlDataLoggerAdapter {

    private final XmlMapper xmlMapper = new XmlMapper();
    private JsonNode jsonNode;

    @Override
    public void convertXml(String xml) {
        try {
            jsonNode = xmlMapper.readTree(xml);
            var json = new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(jsonNode);
            log.info(json);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

}
