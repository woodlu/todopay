package ru.wdl.todopay.service;

public interface ExchangeService<T> {

    T getExchangeRates(String currency);
}
