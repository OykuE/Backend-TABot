package bitirmeprojesi.tabot.api.controllers;

import bitirmeprojesi.tabot.api.dto.RegisterDto;
import bitirmeprojesi.tabot.api.dto.UserTypeDto;
import bitirmeprojesi.tabot.business.abstracts.UserService;
import bitirmeprojesi.tabot.business.abstracts.UserTypeService;
import bitirmeprojesi.tabot.entities.concretes.User;
import bitirmeprojesi.tabot.entities.concretes.UserType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user-types")
public class UserTypeController {

    @Autowired
    public UserTypeController(UserTypeService userTypeService) {
        super();
        this.userTypeService = userTypeService;
    }

    private UserTypeService userTypeService;

    @PostMapping("/save-user-type")
    public ResponseEntity<?> saveUserType(@RequestBody UserTypeDto userTypeDto) {
        UserType userType = new UserType();
        userType.setUserTypeName(userTypeDto.getUserTypeName());
        userTypeService.saveUserType(userType);
        return ResponseEntity.ok("User type is saved");
    }
}
