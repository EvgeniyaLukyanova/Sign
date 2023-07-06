package ru.gazprom.gptrans.signatury.service;

import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.Signature;
import java.util.Enumeration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
//import ru.CryptoPro.JCP.JCP;
import ru.gptrans.gazprom.exception.SignException;

@Service
public class DigitalSignatureService {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    public byte[] signData(int docId, byte[] data) {
        try {
            Signature signature = getDigitalSignature();
            signature.update(data);
            return signature.sign();
        } catch (Exception e) {
            String message = String.format("Не удалось подписать документ %s, по причине: %s", docId, e.getMessage());
            log.error("DigitalSignatureService. Exception: {}", message);
            throw new SignException(message);
        }
    }

    private Signature getDigitalSignature() throws Exception {
//        KeyStore keyStore = KeyStore.getInstance("RutokenStore", "JCP");
//        keyStore.load(null, null);
//        Enumeration<String> aliases = keyStore.aliases();
//        String alias = aliases.nextElement();
//        PrivateKey privateKey = (PrivateKey) keyStore.getKey(alias, "q123456789!".toCharArray());
//        Signature signature = Signature.getInstance(JCP.GOST_SIGN_DH_2012_256_NAME, "JCP");
//        signature.initSign(privateKey);
//        return signature;
        return null;
    }
}