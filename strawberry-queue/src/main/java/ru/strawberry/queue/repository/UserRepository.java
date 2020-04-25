package ru.strawberry.queue.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.strawberry.queue.entity.OSUser;

@Repository
public interface UserRepository extends JpaRepository<OSUser, Integer> {

}
