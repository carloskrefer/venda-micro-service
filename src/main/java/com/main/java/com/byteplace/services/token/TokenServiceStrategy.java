package com.byteplace.services.token;

public interface TokenServiceStrategy<T> {

    public T decode(String token) throws Exception;

}
