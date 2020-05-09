package ru.strawberry.queue.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.strawberry.queue.entity.MethodsUser;
import ru.strawberry.queue.entity.OSUser;
import ru.strawberry.queue.model.QueueRequest;
import ru.strawberry.queue.repository.MethodsUsersRepository;
import ru.strawberry.queue.repository.UserRepository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class BookingService implements BookingServiceInterface{

    @Autowired
    public MethodsUsersRepository methodsUsersRepository;

    @Autowired
    public UserRepository userRepository;

    @Override
    public void bookPlace(QueueRequest queueRequest) {
        if ("Методы программирования".equalsIgnoreCase(queueRequest.getSubject())){
            bookMethods(queueRequest);
        }
        if("Операционные системы".equalsIgnoreCase(queueRequest.getSubject())){
            bookOs(queueRequest);
        }
    }

    private void bookMethods(QueueRequest queueRequest){
        MethodsUser methodsUser = new MethodsUser();
        methodsUser.setName(queueRequest.getStudentName());
        methodsUser.setReserveDate(new Date());
        methodsUser.setSubject(queueRequest.getSubject());
        methodsUser.setTask(queueRequest.getDesiredTask());
        try {
            methodsUser.setTaskDate(new SimpleDateFormat("yyyy-MM-dd").parse(queueRequest.getDesiredDate()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        methodsUsersRepository.save(methodsUser);
    }

    private void bookOs(QueueRequest queueRequest){
        OSUser osUser = new OSUser();
        osUser.setName(queueRequest.getStudentName());
        osUser.setReserveDate(new Date());
        osUser.setSubject(queueRequest.getSubject());
        osUser.setTask(queueRequest.getDesiredTask());
        try {
            osUser.setTaskDate(new SimpleDateFormat("yyyy-mm-dd").parse(queueRequest.getDesiredDate()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if(queueRequest.getDesiredTask().contains("лаб")){
            osUser.setPriority(2);
        }else{
            osUser.setPriority(1);
        }
        userRepository.save(osUser);
    }

}
