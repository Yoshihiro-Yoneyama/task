package task.webaip.infrastructure.util;

import lombok.NonNull;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import task.webaip.domain.task.TaskId;
import task.webaip.lib.IdFactory;

import java.util.UUID;
import java.util.function.Function;

@Configuration
public class IdFactoryConfiguration {
  private static <T> IdFactory<T> uuidFactory(final @NonNull Function<String, T> f) {
    return () -> f.apply(UUID.randomUUID().toString());
  }

  @Bean
  IdFactory<TaskId> taskId() {
    return uuidFactory(TaskId::reconstruct);
  }
}
