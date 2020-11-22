package com.codeonblue.msscbeerservice.services;

import com.codeonblue.msscbeerservice.web.model.BeerDto;
import com.codeonblue.msscbeerservice.web.model.BeerPagedList;
import com.codeonblue.msscbeerservice.web.model.BeerStyleEnum;
import org.springframework.data.domain.PageRequest;

import java.util.UUID;

public interface BeerService {
    BeerDto getById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);

    BeerPagedList listBeers(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest);
}
