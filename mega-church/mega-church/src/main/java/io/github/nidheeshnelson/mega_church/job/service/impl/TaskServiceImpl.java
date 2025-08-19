package io.github.nidheeshnelson.mega_church.job.service.impl;

import io.github.nidheeshnelson.mega_church.common.model.GroupBase;
import io.github.nidheeshnelson.mega_church.job.model.Task;
import io.github.nidheeshnelson.mega_church.user.register.model.User;

public class TaskServiceImpl {
    
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
