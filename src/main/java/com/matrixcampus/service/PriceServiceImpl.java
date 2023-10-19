package com.matrixcampus.service;

import com.matrixcampus.converter.PriceToPriceDtoConverter;
import com.matrixcampus.models.dto.PriceDto;
import com.matrixcampus.models.entity.Price;
import com.matrixcampus.repository.PriceRepository;
import com.matrixcampus.service.interfaces.PriceService;
import com.matrixcampus.utils.DateFormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PriceServiceImpl implements PriceService {

    @Autowired
    private PriceRepository priceRepository;

    @Override
    public PriceDto findPrice(Long productId, Long brandId, String searchDate) {
        final Price price = this.priceRepository.findByDateRange(productId, brandId, DateFormatUtils.parseDateStr(searchDate));
        return price != null ? PriceToPriceDtoConverter.priceToDto(price) : null;
    }

}
