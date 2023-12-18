package org.gl.masera.techcoach.util.data.log;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DataLoggerUtil {

    private final YamlXmlDataLoggerAdapter yamlXmlDataLoggerAdapter;
    private final JsonXmlDataLoggerAdapter jsonXmlDataLoggerAdapter;

    public void convertXmlToJson(String xml) {
        jsonXmlDataLoggerAdapter.convertXml(xml);
    }

    public void convertXmlToYaml(String xml) {
        yamlXmlDataLoggerAdapter.convertXml(xml);
    }

}
