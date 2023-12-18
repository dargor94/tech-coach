package org.gl.masera.techcoach.util.data.log;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Slf4j
@Component
public class YamlXmlDataLoggerAdapter implements XmlDataLoggerAdapter {

    private final XmlMapper xmlMapper = new XmlMapper();
    private final YAMLMapper yamlMapper = new YAMLMapper();


    @Override
    public void convertXml(String xml) {
        try {
            var value = xmlMapper.readValue(xml, Object.class);
            var yaml = yamlMapper.writerWithDefaultPrettyPrinter().writeValueAsString(value);
            log.info(yaml);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

}
