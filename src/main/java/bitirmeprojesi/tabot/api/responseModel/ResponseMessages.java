


package bitirmeprojesi.tabot.api.responseModel;

public enum ResponseMessages {
    REGISTER_SUCCESSFUL("User registered successfully!"),
    EMAIL_ALREADY_TAKEN("This e-mail is already taken!"),
    WRONG_EMAIL("This e-mail couldn't found!"),
    WRONG_PASSWORD("Password and e-mail don't match!"),
    USER_COULD_NOT_FIND("User with this id doesn't exist!"),
    LECTURE_COULD_NOT_FIND("Lecture with this id doesn't exist!"),
    FACULTY_COULD_NOT_FIND("Faculty with this id doesn't exist!"),
    UNIVERSITY_COULD_NOT_FIND("University with this id doesn't exist!");




    private final String message;

    ResponseMessages(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
