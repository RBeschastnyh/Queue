package ru.strawberry.queue.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.strawberry.queue.model.QueueRequest;

@RestController
public class QueueController {

    @PostMapping(path = "/book")
    public String bookPlaceInQueue(@RequestBody QueueRequest queueRequest){
        return queueRequest.getDesiredTask();
    }

}
