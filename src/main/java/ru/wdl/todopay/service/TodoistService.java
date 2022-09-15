package ru.wdl.todopay.service;

import ru.wdl.todopay.dto.ProjectDto;
import ru.wdl.todopay.dto.TaskDto;

import java.util.List;

public interface TodoistService {

    List<ProjectDto> getProjects(String apiKey);

    long findProjectIdByProjectName(String projectName);

    List<TaskDto> getTasksByProjectId(long projectId);
}
