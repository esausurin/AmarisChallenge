package com.amaris.challenge.domian.spi;

import java.time.LocalDateTime;

import com.amaris.challenge.domian.api.entity.Price;
public interface PricePort {
	Price getPriceProductByDateProductBrandNativeQuery(LocalDateTime date, Integer product, Integer brand);

	boolean existsByBrandId(Integer brandId);

	boolean existsByProductId(Integer productId);
	
	Price getPriceProductByDateProductBrandNamedQuery(LocalDateTime date, Integer product, Integer brand);	
}
