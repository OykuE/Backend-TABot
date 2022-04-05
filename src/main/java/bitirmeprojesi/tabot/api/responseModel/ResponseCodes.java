package bitirmeprojesi.tabot.api.responseModel;

public enum ResponseCodes {
    REGISTER_SUCCESSFUL(100),
    EMAIL_ALREADY_TAKEN(101),
    WRONG_EMAIL(102),
    WRONG_PASSWORD(103);



    private final int value;

    ResponseCodes(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
