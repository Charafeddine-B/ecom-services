package org.sid.billingservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("token")
@Data
public class MyConsulConfig {
    private  long accesTokenTimeOut;
    private  long refreshTokenTimeOut;


}
