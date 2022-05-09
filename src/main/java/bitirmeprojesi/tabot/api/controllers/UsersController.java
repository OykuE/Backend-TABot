


package bitirmeprojesi.tabot.api.controllers;

import bitirmeprojesi.tabot.api.dto.ChangePasswordDto;
import bitirmeprojesi.tabot.api.dto.LoginDto;
import bitirmeprojesi.tabot.api.dto.RegisterDto;
import bitirmeprojesi.tabot.api.dto.UserProfilePictureDto;
import bitirmeprojesi.tabot.business.abstracts.UserService;
import bitirmeprojesi.tabot.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public UsersController(UserService userService, BCryptPasswordEncoder bCryptPasswordEncoder) {
        super();
        this.userService = userService;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    private UserService userService;

    @PostMapping("/save-user")
    public ResponseEntity<?> saveUser(@RequestBody RegisterDto registerDto){
        registerDto.setPassword(bCryptPasswordEncoder.encode(registerDto.getPassword()));
        User user = new User();
        user.setUserName(registerDto.getUserName());
        user.setUserSurname(registerDto.getUserSurname());
        user.setUserType(registerDto.getUserType());
        user.setEmail(registerDto.getEmail());
        user.setLectureId(registerDto.getLectureId());
        user.setDepartmentId(registerDto.getDepartmentId());
        user.setUserName(registerDto.getUserName());
        user.setUserName(registerDto.getUserName());

        userService.saveUser(user);
        return ResponseEntity.ok("User is saved");
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable int id){
        return ResponseEntity.ok(userService.getUser(id));
    }

    @PutMapping("/edit-profile-picture")
    public ResponseEntity<?> editUser(@RequestBody UserProfilePictureDto userProfilePictureDto){
        userService.editProfilePicture(userProfilePictureDto.getUserId(), userProfilePictureDto.getProfilePicture());
        return ResponseEntity.ok("Profile picture edited successfully");
    }

    @PutMapping("/change-password")
    public ResponseEntity<?> changePassword(@RequestBody ChangePasswordDto changePasswordDto){
        changePasswordDto.setPassword(bCryptPasswordEncoder.encode(changePasswordDto.getPassword()));
        userService.changePassword(changePasswordDto.getUserId(), changePasswordDto.getPassword());
        return ResponseEntity.ok("Password changed successfully");
    }

}


