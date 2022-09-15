package ru.wdl.todopay.cache;


import ru.wdl.todopay.util.Currency;

public interface ExchangeRateCache {
    double getRate(Currency currency);
}
