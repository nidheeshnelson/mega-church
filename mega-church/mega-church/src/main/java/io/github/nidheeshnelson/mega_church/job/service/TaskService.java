package io.github.nidheeshnelson.mega_church.job.service;

import io.github.nidheeshnelson.mega_church.job.model.Task;
import io.github.nidheeshnelson.mega_church.user.register.model.User;

public interface TaskService {
    Task assignTaskToUser(Task task, User user);
}
