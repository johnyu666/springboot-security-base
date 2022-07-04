package cn.johnyu;

import cn.johnyu.entity.User;
import cn.johnyu.mapper.UserMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SecApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SecApp.class);

    }
}
