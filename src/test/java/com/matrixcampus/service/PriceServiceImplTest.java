package com.matrixcampus.service;

import com.matrixcampus.models.dto.PriceDto;
import com.matrixcampus.repository.PriceRepository;
import com.matrixcampus.utils.DateFormatUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Date;

import static com.matrixcampus.PriceMock.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith({MockitoExtension.class})
@DisplayName("Tests PriceServiceImplTest methods")
public class PriceServiceImplTest {

    private @Mock PriceRepository priceRepository;

    private @InjectMocks PriceServiceImpl priceServiceImpl;

    @Test
    public void testFindPrice() {
        final var searchDateStr = "2020-06-14-10.00.00";
        final var searchDate = DateFormatUtils.parseDateStr("2020-06-14-10.00.00");

        when(priceRepository.findByDateRange(PRODUCT_ID, BRAND_ID, searchDate)).thenReturn(price());

        PriceDto result = priceServiceImpl.findPrice(PRODUCT_ID, BRAND_ID, searchDateStr);

        assertNotNull(result);
        assertEquals(priceDto1(), result);
    }

    @Test
    public void testFindPriceWhenNoResult() {
        final var searchDateStr = "2020-06-14-10.00.00";
        final var searchDate = DateFormatUtils.parseDateStr("2020-06-14-10.00.00");

        when(priceRepository.findByDateRange(PRODUCT_ID, BRAND_ID, searchDate)).thenReturn(null);

        PriceDto result = priceServiceImpl.findPrice(PRODUCT_ID, BRAND_ID, searchDateStr);

        assertNull(result);
    }

}
