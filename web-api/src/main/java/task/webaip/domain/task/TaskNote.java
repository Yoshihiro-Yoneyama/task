package task.webaip.domain.task;

import lombok.NonNull;
import lombok.Value;
import lombok.experimental.Accessors;

@Value
@Accessors(fluent = true)
public class TaskNote {
  public static final int MAX_LENGTH = 3000;
  @NonNull String value;

  public TaskNote(@NonNull final String value) {
    if (value.length() > MAX_LENGTH) throw new IllegalArgumentException("Task note must be 0 to 3000 characters long");
    this.value = value;
  }
}
