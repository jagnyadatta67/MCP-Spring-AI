package com.concept15.mcp_client;


import io.modelcontextprotocol.client.McpSyncClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;


import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class McpClientApplication {

	public static void main(String[] args) {
		//System.out.println(args[0]);
		SpringApplication.run(McpClientApplication.class, args);
	}

	@Value("${ai.user.input}")
	private String userInput;

	McpSyncClient mcpSyncClient;


	@Bean
	public CommandLineRunner predefinedQuestions(ChatClient.Builder chatClientBuilder, ToolCallbackProvider tools,
												 ConfigurableApplicationContext context) {

		return args -> {
			Scanner scanner = new Scanner(System.in);
			var chatClient = chatClientBuilder
					.defaultTools(tools)
					.build();
			while (true) {
				System.out.print("\n>>> QUESTION: ");
				String userInput = scanner.nextLine();

				if ("exit".equalsIgnoreCase(userInput)) {
					System.out.println("Exiting chat. Goodbye!");
					break;
				}

				System.out.println("\n>>> ASSISTANT: " + chatClient.prompt(userInput).call().content());
			}

			context.close();
		};
	}
}



