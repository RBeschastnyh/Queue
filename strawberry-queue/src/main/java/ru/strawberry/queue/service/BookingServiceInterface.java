package ru.strawberry.queue.service;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.strawberry.queue.model.QueueRequest;

public interface BookingServiceInterface {

    void bookPlace(QueueRequest queueRequest);

}
