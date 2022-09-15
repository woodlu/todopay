package ru.wdl.todopay.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;

@Setter
@Getter
@RequiredArgsConstructor
@ToString
public class ApiLayerExchangeDto implements ExchangeDto {
    private String base;
    private Map<String, Double> rates;
    @Override
    public Map<String, Double> getRates() {
        return rates;
    }
}
