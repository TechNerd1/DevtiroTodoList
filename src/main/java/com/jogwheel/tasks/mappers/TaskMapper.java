package com.jogwheel.tasks.mappers;

import com.jogwheel.tasks.domain.dto.TaskDto;
import com.jogwheel.tasks.domain.entities.Task;

public interface TaskMapper {

    Task fromDto(TaskDto taskDto);

    TaskDto toDto(Task task);

}
