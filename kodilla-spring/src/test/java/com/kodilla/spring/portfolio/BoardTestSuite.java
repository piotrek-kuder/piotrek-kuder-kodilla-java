package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testAddTask() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().getTaskList().add("task TO DO nr 1");
        board.getToDoList().getTaskList().add("task TO DO nr 2");
        board.getInProgressList().getTaskList().add("task IN PROGRESS nr 1");
        board.getInProgressList().getTaskList().add("task IN PROGRESS nr 2");
        board.getDoneList().getTaskList().add("task DONE nr 1");
        board.getDoneList().getTaskList().add("task DONE nr 2");
        //Then
        System.out.println("\n<<< Beans created with BoardConfig >>>");
        System.out.println("To do list:");
        board.getToDoList().getTaskList().forEach(System.out::println);
        System.out.println("In progress list:");
        board.getInProgressList().getTaskList().forEach(System.out::println);
        System.out.println("Done list:");
        board.getDoneList().getTaskList().forEach(System.out::println);
    }

    @Test
    void testAddTaskDifferentConfig() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfigSingleTaskList.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().getTaskList().add("task TO DO nr 1");
        board.getToDoList().getTaskList().add("task TO DO nr 2");
        board.getInProgressList().getTaskList().add("task IN PROGRESS nr 1");
        board.getInProgressList().getTaskList().add("task IN PROGRESS nr 2");
        board.getDoneList().getTaskList().add("task DONE nr 1");
        board.getDoneList().getTaskList().add("task DONE nr 2");
        //Then
        System.out.println("\n<<< Beans created with BoardConfigSingleTaskList >>>");
        System.out.println("To do list:");
        board.getToDoList().getTaskList().forEach(System.out::println);
        System.out.println("In progress list:");
        board.getInProgressList().getTaskList().forEach(System.out::println);
        System.out.println("Done list:");
        board.getDoneList().getTaskList().forEach(System.out::println);
    }
}
