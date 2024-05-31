package tech.goshen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.goshen.model.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
