package bitirmeprojesi.tabot.api.responseModel;

public enum ResponseMessages {
    REGISTER_SUCCESSFUL("User registered successfully!"),
    EMAIL_ALREADY_TAKEN("This e-mail is already taken!"),
    WRONG_EMAIL("This e-mail couldn't found!"),
    WRONG_PASSWORD("Password and e-mail don't match!");



    private final String message;

    ResponseMessages(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
