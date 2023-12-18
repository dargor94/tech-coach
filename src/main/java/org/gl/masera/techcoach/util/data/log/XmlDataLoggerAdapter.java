package org.gl.masera.techcoach.util.data.log;

import org.springframework.stereotype.Component;

@Component
public interface XmlDataLoggerAdapter {

    void convertXml(String xml);

}
