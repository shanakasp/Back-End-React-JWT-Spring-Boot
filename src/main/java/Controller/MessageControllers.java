package Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class MessageControllers {
    @GetMapping("/messages")
    public ResponseEntity<List<String>> messages()
    {
        return  ResponseEntity.ok(Arrays.asList("first", "second"));
    }

}
