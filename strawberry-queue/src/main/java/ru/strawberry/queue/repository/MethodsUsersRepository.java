package ru.strawberry.queue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.strawberry.queue.entity.MethodsUser;

@Repository
public interface MethodsUsersRepository extends JpaRepository<MethodsUser, Integer> {
}
