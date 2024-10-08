package io.github.llmagentbuilder.example.csvprocessor;

import io.github.llmagentbuilder.core.PromptParamsProvider;
import java.io.File;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import org.jetbrains.annotations.Nullable;

public class CsvFilesPromptParamsProvider implements PromptParamsProvider {

  private String csvFiles = "";

  public CsvFilesPromptParamsProvider() {
    var files = Path.of(".", "test_data", "input").toFile()
        .listFiles((dir, name) -> name.endsWith(".csv"));
    if (files != null) {
      csvFiles = Arrays.stream(files).map(File::getName)
          .collect(Collectors.joining(", "));
    }
  }

  @Nullable
  @Override
  public Map<String, Object> provideSystemParams() {
    return Map.of("files", csvFiles);
  }

  @Nullable
  @Override
  public Map<String, Object> provideUserParams() {
    return Map.of();
  }
}
