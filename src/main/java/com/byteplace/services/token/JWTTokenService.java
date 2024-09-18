package com.byteplace.services.token;
import com.auth0.jwt.JWT;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JWTTokenService<T> implements TokenServiceStrategy<T> {

    private final Class<T> type;

    public JWTTokenService(Class<T> type) {
        this.type = type;
    }

    public T decode(String token) throws Exception {
        try {
            // Decodificar o JWT (não verifica assinatura)
            DecodedJWT decodedJWT = JWT.decode(token);

            // Obter o payload como uma string
            String payload = decodedJWT.getPayload();

            // O payload do JWT está codificado em Base64, então precisamos decodificá-lo
            byte[] decodedBytes = java.util.Base64.getDecoder().decode(payload);
            String decodedPayload = new String(decodedBytes);

            // Converter o payload decodificado para o tipo T usando ObjectMapper
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(decodedPayload, type);

        } catch (Exception e) {
            throw new Exception("Erro ao decodificar o token JWT: " + e.getMessage(), e);
        }
    }

}
