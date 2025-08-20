package io.github.nidheeshnelson.mega_church.job.enumeration;

public enum TaskPriority {
    LOW,
    MEDIUM,
    HIGH,
    CRITICAL,   // For tasks that require immediate attention
    URGENT,     // For tasks that need to be handled quickly but not immediately
    LOWEST,     // For tasks with minimal importance
    HIGHEST;    // For tasks that are the most important
}
