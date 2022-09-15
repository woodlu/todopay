package ru.wdl.todopay.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.wdl.todopay.dto.ApiLayerExchangeDto;
import ru.wdl.todopay.service.ExchangeService;

@RestController
@RequestMapping("/")
public class TodoistController {

    private final ExchangeService<ApiLayerExchangeDto> exchangeService;

    public TodoistController(ExchangeService<ApiLayerExchangeDto> exchangeService) {
        this.exchangeService = exchangeService;
    }

    @GetMapping("/exchange")
    public ApiLayerExchangeDto testExchangeService() {
        return exchangeService.getExchangeRates("asd");
    }
}
