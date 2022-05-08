package com.kagzz.jmix.rys.product.mapper;

import com.kagzz.jmix.rys.app.JmixEntityFactory;
import com.kagzz.jmix.rys.product.dto.ProductPriceData;
import com.kagzz.jmix.rys.product.entity.ProductPrice;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {JmixEntityFactory.class})
public interface ProductPriceMapper {

    ProductPrice toEntity(ProductPriceData productData);
}