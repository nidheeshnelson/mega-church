package io.github.nidheeshnelson.mega_church.job.service.impl;

import org.springframework.stereotype.Service;

import io.github.nidheeshnelson.mega_church.common.model.GroupBase;
import io.github.nidheeshnelson.mega_church.job.model.Task;
import io.github.nidheeshnelson.mega_church.job.repository.TaskRepository;
import io.github.nidheeshnelson.mega_church.user.register.model.User;

@Service
public class TaskServiceImpl {

    private TaskRepository taskRepository;
    
    public Task assignTaskToUser(Task task, User user) {
    GroupBase group = task.getJob().getAssignedGroup();
    if (group == null || !group.getMembers().contains(user)) {
        throw new IllegalArgumentException(
            "Assignee must be a member of the job's assigned group.");
    }
    task.setAssignedToUser(user);
    return taskRepository.save(task);
}
}
