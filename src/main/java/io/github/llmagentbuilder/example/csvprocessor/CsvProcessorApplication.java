package io.github.llmagentbuilder.example.csvprocessor;

import io.github.llmagentbuilder.spring.dev.AgentDevConfiguration;
import io.github.llmagentbuilder.spring.spring.agentcontroller.AgentControllerConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({AgentDevConfiguration.class, AgentControllerConfiguration.class})
public class CsvProcessorApplication {

  public static void main(String[] args) {
    SpringApplication.run(CsvProcessorApplication.class, args);
  }
}
