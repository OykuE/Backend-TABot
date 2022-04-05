package bitirmeprojesi.tabot.api.responseModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDto<T> {
    private String responseMessage;
    private int responseCode;
    private T responseObject;
}
