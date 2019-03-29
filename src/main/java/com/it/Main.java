package com.it;

import com.it.config.AppConfiguration;
import com.it.model.User;
import com.it.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Optional;
@Component
public class Main {
    @Autowired
    private UserRepository userRepository;

        public static void main(String[] args) {
            AnnotationConfigApplicationContext annotatedClassApplicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
            Main main = annotatedClassApplicationContext.getBean("main", Main.class);
            Optional<User> one = main.getUserRepository().findById(1L);
            one.ifPresent(System.out::println);

            one.ifPresent(main.getUserRepository()::delete);
            one = main.getUserRepository().findById(2L);
            System.out.println(one.isPresent());

            User user = new User();
            user.setUserName("HELEN");
            main.getUserRepository().save(user);
            Optional<User> three = main.getUserRepository().findById(3L);
            three.ifPresent(System.out::println);

            user.setUserName("VICTOR");
            main.getUserRepository().saveAndFlush(user);
            three = main.getUserRepository().findById(3L);
            three.ifPresent(System.out::println);

           // System.out.println(main.getUserRepository().findByName(""));
        }

        public UserRepository getUserRepository() {
            return userRepository;
        }

        public void setUserRepository(UserRepository userRepository) {
            this.userRepository = userRepository;
        }



    }




