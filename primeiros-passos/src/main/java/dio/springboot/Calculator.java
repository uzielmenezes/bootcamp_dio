package dio.springboot;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    public int sum (int n1, int n2) {
        return n1 + n2;
    }

}
