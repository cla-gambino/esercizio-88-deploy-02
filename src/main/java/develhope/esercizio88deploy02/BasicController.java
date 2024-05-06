package develhope.esercizio88deploy02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class BasicController {

    @GetMapping("/sum")
    public int sum() {
        Random rand = new Random();
        int num1 = rand.nextInt(100);
        int num2 = rand.nextInt(100);
        return num1 + num2;
    }
}
