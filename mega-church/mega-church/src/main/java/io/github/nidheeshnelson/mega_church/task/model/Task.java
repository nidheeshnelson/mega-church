package io.github.nidheeshnelson.mega_church.task.model;

import java.time.LocalDateTime;

import io.github.nidheeshnelson.mega_church.church.spiritual.carecell.FamilyGroup;
import io.github.nidheeshnelson.mega_church.task.enumeration.RecurringInterval;
import io.github.nidheeshnelson.mega_church.task.enumeration.TaskPriority;
import io.github.nidheeshnelson.mega_church.task.enumeration.TaskStatus;
import io.github.nidheeshnelson.mega_church.user.register.model.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tasks")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Title of the task
    @Column(name = "title", nullable = false)
    private String title;

    // Description of the task
    @Column(name = "description")
    private String description;

    // The date and time when the task was created
    @Column(name = "created_date", nullable = false)
    private LocalDateTime createdDate;

    // The due date of the task
    @Column(name = "due_date")
    private LocalDateTime dueDate;

    // Task status - New, In Progress, Completed, etc.
    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private TaskStatus status;

    // Task priority - Low, Medium, High
    @Enumerated(EnumType.STRING)
    @Column(name = "priority", nullable = false)
    private TaskPriority priority;

    // The user assigned to the task (can be a Pastor, Volunteer, etc.)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "assigned_to_user_id", referencedColumnName = "id")
    private User assignedToUser;

    // Associated with the family/group
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "family_group_id", referencedColumnName = "id")
    private FamilyGroup familyGroup;

    // Optional completion date
    @Column(name = "completed_date")
    private LocalDateTime completedDate;

    // Whether the task is recurring
    @Column(name = "is_recurring", nullable = false)
    private boolean isRecurring;

    // Recurring interval (if task is recurring)
    @Enumerated(EnumType.STRING)
    @Column(name = "recurring_interval")
    private RecurringInterval recurringInterval;
    
}