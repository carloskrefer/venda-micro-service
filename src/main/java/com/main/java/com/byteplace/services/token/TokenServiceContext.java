package com.byteplace.services.token;

public class TokenServiceContext<T> {
    private TokenServiceStrategy<T> tokenServiceStrategy;

    public void setStrategy(TokenServiceStrategy<T> tokenServiceStrategy) {
        this.tokenServiceStrategy = tokenServiceStrategy;
    }

    public T decode(String token) throws Exception {
        return this.tokenServiceStrategy.decode(token);
    }

}
