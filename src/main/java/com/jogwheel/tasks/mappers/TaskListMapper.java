package com.jogwheel.tasks.mappers;

import com.jogwheel.tasks.domain.dto.TaskDto;
import com.jogwheel.tasks.domain.dto.TaskListDto;
import com.jogwheel.tasks.domain.entities.TaskList;

public interface TaskListMapper {

    TaskList fromDto(TaskListDto taskListDto);

    TaskListDto toDto(TaskList taskList);

}
