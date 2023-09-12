package by.home.springapp;

import org.springframework.stereotype.Component;

@Component("pop")
public class PopMusic implements Music {
    public String getSong(){
        return "Bad romance";
    }
}
