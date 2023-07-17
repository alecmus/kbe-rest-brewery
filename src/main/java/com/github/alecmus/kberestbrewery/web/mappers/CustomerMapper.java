package com.github.alecmus.kberestbrewery.web.mappers;

import com.github.alecmus.kberestbrewery.domain.Customer;
import com.github.alecmus.kberestbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDto dto);

    CustomerDto customerToCustomerDto(Customer customer);
}
