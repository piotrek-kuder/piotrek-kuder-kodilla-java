package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testAddTask() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = (Board)context.getBean("getBoard");
        Board board2 = (Board) context.getBean("getBoard");
        //When
        board.getToDoList().getTaskList().add("task TO DO 1");
        board.getInProgressList().getTaskList().add("task IN PROGRESS 1");
        board.getDoneList().getTaskList().add("task DONE 1");
        board2.getToDoList().getTaskList().add("task TO DO 2");
        board2.getInProgressList().getTaskList().add("task IN PROGRESS 2");
        board2.getDoneList().getTaskList().add("task DONE 2");
        //Then
        System.out.println("To do list:");
        board.getToDoList().getTaskList().forEach(System.out::println);
        System.out.println("In progress list:");
        board.getInProgressList().getTaskList().forEach(System.out::println);
        System.out.println("Done list:");
        board2.getDoneList().getTaskList().forEach(System.out::println);
        System.out.println("\n<<< Beans created with BoardConfig >>>");
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
