package ru.gazprom.gptrans.signatury.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.gazprom.gptrans.signatury.client.generated.IEtranSysservice;

import javax.xml.ws.WebServiceException;
import java.net.MalformedURLException;
import java.net.URL;

@Configuration
public class IEtranSysConfiguration {
    @Value("${etran.url}")
    private String etranUrl;

    @Bean
    public IEtranSysservice iEtranSysservice() {
        try {
            return new IEtranSysservice(new URL(etranUrl));
        } catch (MalformedURLException ex) {
            //LOG.error("The server address {} could not be wrapped in URL", etranUrl);
            throw new WebServiceException(ex);
        }
    }
}
