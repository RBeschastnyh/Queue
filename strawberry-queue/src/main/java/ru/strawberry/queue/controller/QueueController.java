package ru.strawberry.queue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.strawberry.queue.entity.MethodsUser;
import ru.strawberry.queue.entity.OSUser;
import ru.strawberry.queue.model.QueueRequest;
import ru.strawberry.queue.repository.MethodsUsersRepository;
import ru.strawberry.queue.repository.UserRepository;
import ru.strawberry.queue.service.BookingService;

import java.util.Date;

@RestController
public class QueueController {

    @Autowired
    public BookingService bookingService;

    @PostMapping(path = "/book")
    public void bookPlaceInQueue(QueueRequest queueRequest){
        bookingService.bookPlace(queueRequest);
    }

}
