package ru.wdl.todopay.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import ru.wdl.todopay.dto.ApiLayerExchangeDto;

@Service
public class ExchangeServiceImpl implements ExchangeService<ApiLayerExchangeDto> {

    private final WebClient webClient;

    public ExchangeServiceImpl(WebClient webClient) {
        this.webClient = webClient;
    }


    @Override
    public ApiLayerExchangeDto getExchangeRates(String currency) {
        String url = "https://api.apilayer.com/exchangerates_data/latest?base=EUR";

        ApiLayerExchangeDto result = webClient.get().uri(url).header("apikey","2WHNIzMLs7OyDeWFbwFpg50kjSPRgzvX").retrieve().bodyToMono(ApiLayerExchangeDto.class).block();

        return result;
    }
}
