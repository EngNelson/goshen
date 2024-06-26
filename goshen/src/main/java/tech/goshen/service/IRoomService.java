package tech.goshen.service;

import org.springframework.web.multipart.MultipartFile;
import tech.goshen.model.Room;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;

public interface IRoomService {
    Room addNewRoom(MultipartFile photo, String roomType, BigDecimal roomPrice) throws IOException, SQLException;
}

