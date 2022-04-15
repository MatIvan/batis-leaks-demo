package com.demo.test_leak_demo.controller;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

import com.demo.test_leak_demo.manager.ShutdownManager;
import com.demo.test_leak_demo.service.TestService;

@Controller
public class ArgsController implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(ArgsController.class);

    @Autowired
    private TestService service;

    @Autowired
    private ShutdownManager manager;

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("\t==== Test leak service ====");
        Scanner scanner = new Scanner(System.in);
        Integer count = readCountFromCommandLine(scanner);
        service.startTest(count);
        System.out.print("Press Enter to exit..");
        scanner.nextLine();
        scanner.nextLine();
        scanner.close();
        manager.initiateShutdown(0);
    }

    private Integer readCountFromCommandLine(Scanner scanner) {
        int count;
        System.out.print("Request count > ");
        do {
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.print("Incorrect count. Request count > ");
            }
            count = scanner.nextInt();
            if (count < 0) {
                System.out.print("Negative count. Request count > ");
            }
        } while (count <= 0);
        return count;
    }
}
