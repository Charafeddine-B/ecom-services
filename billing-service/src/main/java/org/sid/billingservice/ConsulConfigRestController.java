package org.sid.billingservice;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ConsulConfigRestController {
    @Autowired
    private MyConsulConfig myConsulConfig;
    @Autowired
    private MyVaultConfig myVaultConfig;

//    private final MyVaultConfig myVaultConfig;


//    @Value("${token.accesTokenTimeOut}")
//    private long accesTokenTimeOut;
//    @Value("${token.refreshTokenTimeOut}")
//    private long refreshTokenTimeOut;

//    @GetMapping(path = "/myConfig")
//    public MyConsulConfig myConfig(){
//        return myConsulConfig;
//    }
    @GetMapping(path = "/myConfig")
    public Map<String, Object> myConfig(){
        return Map.of("consul config", myConsulConfig,
                "vault ", myVaultConfig);
    }
}
