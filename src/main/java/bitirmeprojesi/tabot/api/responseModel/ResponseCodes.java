


package bitirmeprojesi.tabot.api.responseModel;

public enum ResponseCodes {
    REGISTER_SUCCESSFUL(100),
    EMAIL_ALREADY_TAKEN(101),
    WRONG_EMAIL(102),
    WRONG_PASSWORD(103),
    USER_COULD_NOT_FIND(104),
    LECTURE_COULD_NOT_FIND(105),
    FACULTY_COULD_NOT_FIND(106),
    UNIVERSITY_COULD_NOT_FIND(107);




    private final int value;

    ResponseCodes(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
