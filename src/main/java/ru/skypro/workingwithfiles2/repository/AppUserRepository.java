package ru.skypro.workingwithfiles2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.skypro.workingwithfiles2.department.AppUser;

import java.util.Optional;


@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Integer> {
    Optional<AppUser> findAppUserByLogin(String login);

}
