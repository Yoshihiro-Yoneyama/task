package task.webaip.domain.task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskNoteTest {
  @Test
  void タスク説明が3000文字より多い場合は例外が発生する() {
    assertThrows(IllegalArgumentException.class, () -> {
      new TaskNote("a".repeat(3001));
    });
  }

  @Test
  void タスク説明が3000文字以下の場合は例外が発生しない() {
    final var taskNote = assertDoesNotThrow(() -> new TaskNote("a".repeat(3000)));
    assertEquals("a".repeat(3000), taskNote.value());
  }
}