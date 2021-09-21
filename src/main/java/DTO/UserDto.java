package DTO;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import entity.User;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class UserDto {
    private String fullName;

    private String email;

    private String avatar;

    private String phone;
    public UserDto(User origin){
        this.fullName = origin.getFullName();
        this.email = origin.getEmail();
        this.avatar = origin.getAvatar();
        this.phone=origin.getPhone();
    }
}
