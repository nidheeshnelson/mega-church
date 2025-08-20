package io.github.nidheeshnelson.mega_church.job.service.impl;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import io.github.nidheeshnelson.mega_church.job.model.Job;
import io.github.nidheeshnelson.mega_church.job.model.Task;
import io.github.nidheeshnelson.mega_church.job.repository.JobRepository;
import io.github.nidheeshnelson.mega_church.job.repository.TaskRepository;

@Service
public class JobServiceImpl {

private JobRepository jobRepository;
private TaskRepository taskRepository;

public Task createTask(long jobId, 
                        String taskTitle, 
                        String taskDescription, 
                        LocalDateTime taskStartDate, 
                        LocalDateTime taskEndDate){

    Job job = jobRepository.findById(jobId).orElseThrow(() -> new RuntimeException("Job not found"));
    Task task = job.createTask(taskTitle, 
                            taskDescription, 
                            taskStartDate, 
                            taskEndDate);
    jobRepository.save(job);
    taskRepository.saveAll(job.getTasks());
    return task;
}
}
