package ru.strawberry.queue.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.strawberry.queue.model.QueueRequest;

@RestController
public class QueueController {

    @PostMapping(path = "/book")
    public String bookPlaceInQueue(QueueRequest queueRequest){
        System.out.println(queueRequest.getDesiredDate());
        return queueRequest.getDesiredTask();
    }

}
