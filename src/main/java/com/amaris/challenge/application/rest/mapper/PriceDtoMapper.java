package com.amaris.challenge.application.rest.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.amaris.challenge.application.rest.dto.PriceDto;
import com.amaris.challenge.domian.api.entity.Price;

@Mapper(componentModel = "spring")
public interface PriceDtoMapper {
	
	PriceDto map(Price entity);
	
	@Mapping(target="currency", ignore = true)
	@Mapping(target="id", ignore = true)
	@Mapping(target="priority", ignore = true)
	Price map(PriceDto entity);
}
