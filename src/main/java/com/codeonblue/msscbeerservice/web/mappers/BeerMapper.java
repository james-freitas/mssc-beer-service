package com.codeonblue.msscbeerservice.web.mappers;

import com.codeonblue.msscbeerservice.domain.Beer;
import com.codeonblue.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto dto);
}
