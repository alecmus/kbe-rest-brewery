package com.github.alecmus.kberestbrewery.web.mappers;

import com.github.alecmus.kberestbrewery.domain.Beer;
import com.github.alecmus.kberestbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    BeerDto beerToBeerDtoWithInventory(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}
