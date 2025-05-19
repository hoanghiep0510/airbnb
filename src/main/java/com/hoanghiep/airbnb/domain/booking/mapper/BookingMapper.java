package com.hoanghiep.airbnb.domain.booking.mapper;

import com.hoanghiep.airbnb.domain.booking.dto.response.BookingResponse;
import com.hoanghiep.airbnb.domain.booking.entity.Booking;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookingMapper {
    BookingResponse map(Booking booking);
}
