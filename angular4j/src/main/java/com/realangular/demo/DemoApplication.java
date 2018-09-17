package com.realangular.demo;

import com.realangular.demo.domain.Task;
import com.realangular.demo.service.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(TaskService taskService){
        return args -> {
            taskService.save(new Task(1L,"Create Spring Boot App", LocalDate.now(), true));
            taskService.save(new Task(2L,"Create Spring Projects Packages", LocalDate.now().plus(1,ChronoUnit.DAYS), false));
            taskService.save(new Task(3L,"Create The Task Domain Class", LocalDate.now().plus(1,ChronoUnit.DAYS), false));
            taskService.save(new Task(4L,"Create Service and repository classes", LocalDate.now().plus(1,ChronoUnit.DAYS), false));
            taskService.save(new Task(5L,"Create the command line runner", LocalDate.now().plus(1,ChronoUnit.DAYS), false));
            taskService.save(new Task(6L,"Create the required conf properties", LocalDate.now().plus(1,ChronoUnit.DAYS), false));
            taskService.save(new Task(7L,"Run the Spring Boot App", LocalDate.now().plus(1,ChronoUnit.DAYS), false));
            taskService.save(new Task(8L,"Check the H2 console for the initial data", LocalDate.now().plus(1,ChronoUnit.DAYS), false));
        };
    }
}
