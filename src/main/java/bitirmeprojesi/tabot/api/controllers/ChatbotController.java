package bitirmeprojesi.tabot.api.controllers;

import bitirmeprojesi.tabot.business.abstracts.DepartmentService;
import bitirmeprojesi.tabot.entities.concretes.Department;
import bitirmeprojesi.tabot.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/api/chatbot")
public class ChatbotController {

    @Autowired
    public ChatbotController() {
        super();
    }

    @GetMapping("/get-answer-from-ml")
    public ResponseEntity<Object> getAnswerFromML(String question) throws URISyntaxException {
        String uriStr = "http://localhost:8080/ml"; //todo ml servisi bağlanacak
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        RestTemplate restTemplate = new RestTemplate();
        URI uri = new URI(uriStr);
        HttpEntity<Object> httpEntity = new HttpEntity<>(question, headers);

        Object result = restTemplate.postForObject(uri, httpEntity, Object.class);
        return ResponseEntity.ok(result);
    }


}
