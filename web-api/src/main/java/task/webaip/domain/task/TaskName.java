package task.webaip.domain.task;

import lombok.NonNull;
import lombok.Value;
import lombok.experimental.Accessors;

@Value
@Accessors(fluent = true)
public class TaskName {
  public static final int MAX_LENGTH = 30;
  @NonNull String value;

  public TaskName(@NonNull final String value) {
    if (value.isEmpty() || value.length() > MAX_LENGTH) throw new IllegalArgumentException("Task name must be 1 to 30 characters long");
    this.value = value;
  }
}
