package com.amaris.challenge.domian.api.service;

import java.time.LocalDateTime;

import com.amaris.challenge.domian.api.entity.Price;

public interface PriceService {
	Price getPriceProductByDateProductBrand(LocalDateTime date, Integer product, Integer brand);
	Price getPriceProductByDateProductBrandNamedQuery(LocalDateTime date, Integer product, Integer brand);
		
}
