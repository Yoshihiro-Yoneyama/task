package task.webaip.domain.task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskNameTest {
  @Test
  void タスク名が30文字より多い場合は例外が発生する() {
    assertThrows(IllegalArgumentException.class, () -> new TaskName("a".repeat(31)));
  }

  @Test
  void タスク名が30文字以下の場合は例外が発生しない() {
    final var taskName = assertDoesNotThrow(() -> new TaskName("a".repeat(30)));
    assertEquals("a".repeat(30), taskName.value());
  }
}