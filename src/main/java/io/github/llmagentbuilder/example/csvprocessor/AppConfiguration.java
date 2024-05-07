package io.github.llmagentbuilder.example.csvprocessor;

import io.github.alexcheng1982.springai.dashscope.DashscopeChatOptions;
import io.github.alexcheng1982.springai.dashscope.api.DashscopeModelName;
import io.github.llmagentbuilder.spring.dev.AgentDevConfiguration;
import io.github.llmagentbuilder.spring.spring.agentcontroller.AgentController;
import org.springframework.ai.chat.prompt.ChatOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({AgentDevConfiguration.class, AgentController.class})
public class AppConfiguration {

  @Bean
  public ChatOptions chatOptions() {
    return DashscopeChatOptions.builder()
        .withModel(DashscopeModelName.QWEN_PLUS).build();
  }
}
