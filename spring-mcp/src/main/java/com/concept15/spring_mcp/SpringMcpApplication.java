package com.concept15.spring_mcp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ai.tool.ToolCallback;
import org.springframework.ai.tool.ToolCallbacks;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringMcpApplication {
	private static final Logger log = LoggerFactory.getLogger(SpringMcpApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringMcpApplication.class, args);
	}
	@Bean
	public List<ToolCallback> danTools(SpringMCPServerService courseService) {
		log.info(Arrays.toString(Thread.currentThread().getStackTrace()).replace( ',', '\n' ));

		return Arrays.asList(ToolCallbacks.from(courseService));
	}
}
