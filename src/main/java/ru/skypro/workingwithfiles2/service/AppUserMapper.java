package ru.skypro.workingwithfiles2.service;


import org.springframework.stereotype.Component;
import ru.skypro.workingwithfiles2.department.AppUser;
import ru.skypro.workingwithfiles2.dto.AppUserDto;

@Component
public class AppUserMapper {

    public AppUserDto toDto(AppUser user) {
        AppUserDto userDto = new AppUserDto();
        userDto.setId(user.getId());
        userDto.setLogin(user.getLogin());
        userDto.setPassword(user.getPassword());
        userDto.setRole(user.getRole());
        return userDto;
    }

}
