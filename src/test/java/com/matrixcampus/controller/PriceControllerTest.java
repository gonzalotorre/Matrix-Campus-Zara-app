package com.matrixcampus.controller;

import com.matrixcampus.models.dto.PriceDto;
import com.matrixcampus.repository.PriceRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static com.matrixcampus.PriceMock.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ExtendWith({SpringExtension.class})
public class PriceControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private PriceRepository priceRepository;

    @Test
    public void testFindPriceCase1() {
        String searchDate = "2020-06-14-10.00.00";

        ResponseEntity<PriceDto> responseEntity = restTemplate.getForEntity(
                "/productId/{productId}/brandId/{brandId}/searchDate/{searchDate}",
                PriceDto.class,
                PRODUCT_ID, BRAND_ID, searchDate
        );

        // Verificacion de la respuesta
        assertThat(responseEntity.getStatusCode().is2xxSuccessful()).isTrue();

        PriceDto responseBody = responseEntity.getBody();

        assertNotNull(responseBody);
        assertEquals(priceDto1(), responseBody);
        assertEquals(responseBody.getStartDate(), priceDto1().getStartDate());
        assertEquals(responseBody.getEndDate(), priceDto1().getEndDate());
    }

    @Test
    public void testFindPriceCase2() {
        String searchDate = "2020-06-14-16.00.00";

        ResponseEntity<PriceDto> responseEntity = restTemplate.getForEntity(
                "/productId/{productId}/brandId/{brandId}/searchDate/{searchDate}",
                PriceDto.class,
                PRODUCT_ID, BRAND_ID, searchDate
        );

        // Verificacion de la respuesta
        assertThat(responseEntity.getStatusCode().is2xxSuccessful()).isTrue();

        PriceDto responseBody = responseEntity.getBody();

        assertNotNull(responseBody);
        assertEquals(priceDto2(), responseBody);
        assertEquals(responseBody.getStartDate(), priceDto2().getStartDate());
        assertEquals(responseBody.getEndDate(), priceDto2().getEndDate());
    }

    @Test
    public void testFindPriceCase3() {
        String searchDate = "2020-06-14-21.00.00";

        ResponseEntity<PriceDto> responseEntity = restTemplate.getForEntity(
                "/productId/{productId}/brandId/{brandId}/searchDate/{searchDate}",
                PriceDto.class,
                PRODUCT_ID, BRAND_ID, searchDate
        );

        // Verificacion de la respuesta
        assertThat(responseEntity.getStatusCode().is2xxSuccessful()).isTrue();

        PriceDto responseBody = responseEntity.getBody();

        assertNotNull(responseBody);
        assertEquals(priceDto1(), responseBody);
        assertEquals(responseBody.getStartDate(), priceDto1().getStartDate());
        assertEquals(responseBody.getEndDate(), priceDto1().getEndDate());
    }

    @Test
    public void testFindPriceCase4() {
        String searchDate = "2020-06-15-10.00.00";

        ResponseEntity<PriceDto> responseEntity = restTemplate.getForEntity(
                "/productId/{productId}/brandId/{brandId}/searchDate/{searchDate}",
                PriceDto.class,
                PRODUCT_ID, BRAND_ID, searchDate
        );

        // Verificacion de la respuesta
        assertThat(responseEntity.getStatusCode().is2xxSuccessful()).isTrue();

        PriceDto responseBody = responseEntity.getBody();

        assertNotNull(responseBody);
        assertEquals(priceDto3(), responseBody);
        assertEquals(responseBody.getStartDate(), priceDto3().getStartDate());
        assertEquals(responseBody.getEndDate(), priceDto3().getEndDate());
    }

    @Test
    public void testFindPriceCase5() {
        String searchDate = "2020-06-16-21.00.00";

        ResponseEntity<PriceDto> responseEntity = restTemplate.getForEntity(
                "/productId/{productId}/brandId/{brandId}/searchDate/{searchDate}",
                PriceDto.class,
                PRODUCT_ID, BRAND_ID, searchDate
        );

        // Verificacion de la respuesta
        assertThat(responseEntity.getStatusCode().is2xxSuccessful()).isTrue();

        PriceDto responseBody = responseEntity.getBody();

        assertNotNull(responseBody);
        assertEquals(priceDto4(), responseBody);
        assertEquals(responseBody.getStartDate(), priceDto4().getStartDate());
        assertEquals(responseBody.getEndDate(), priceDto4().getEndDate());
    }
}
