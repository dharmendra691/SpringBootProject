package com.dg.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
//ctrl+shift+O(imports)
@Component //=>Tell to container Creating object
public class MyMessageRunner implements CommandLineRunner {

 //ctrl+space > choose run > press enter
 @Override
 public void run(String... args) throws Exception {
 	// syout > ctrl+space
	System.out.println("Welcome to First SpringBoot Application.");
 }
}
