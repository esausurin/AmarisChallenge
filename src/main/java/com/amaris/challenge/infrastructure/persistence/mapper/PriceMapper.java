package com.amaris.challenge.infrastructure.persistence.mapper;

import org.mapstruct.Mapper;

import com.amaris.challenge.domian.api.entity.Price;
import com.amaris.challenge.infrastructure.persistence.entity.PriceEntity;

@Mapper(componentModel = "spring")
public abstract class PriceMapper {
	public abstract Price mapFromPersistence (PriceEntity entity);
	public abstract PriceEntity mapToPersistence (Price bo);
}