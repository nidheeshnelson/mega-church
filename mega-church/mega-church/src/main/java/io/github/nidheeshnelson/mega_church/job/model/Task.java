package io.github.nidheeshnelson.mega_church.job.model;

import java.time.LocalDateTime;

import io.github.nidheeshnelson.mega_church.church.spiritual.carecell.FamilyGroup;
import io.github.nidheeshnelson.mega_church.common.model.GroupBase;
import io.github.nidheeshnelson.mega_church.job.enumeration.RecurringInterval;
import io.github.nidheeshnelson.mega_church.job.enumeration.TaskPriority;
import io.github.nidheeshnelson.mega_church.job.enumeration.TaskStatus;
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
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Represents a Task that belongs to a {@link Job} and may be assigned to a {@link User}.
 *
 * <p>A Task is the smallest unit of work in the system. Each task can:
 * <ul>
 *   <li>Belong to a {@link Job} (a higher-level work container).</li>
 *   <li>Be assigned to a {@link User} (e.g., Pastor, Volunteer).</li>
 *   <li>Optionally be associated with a {@link FamilyGroup}.</li>
 *   <li>Have scheduling metadata such as due dates, recurring intervals, and completion timestamps.</li>
 * </ul>
 *
 * <p><b>Lifecycle</b>:
 * Tasks are created with a title, description, priority, and status. They may be updated
 * over time (e.g., marked as completed, reassigned, or extended with recurring rules).</p>
 *
 * @author 
 *   Nidheesh Nelson
 */
@Entity
@Table(name = "tasks")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Task {

    /** Unique identifier of the task (primary key). */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** Short title or summary of the task. */
    @Column(name = "title", nullable = false, length = 100)
    private String title;

    /** Detailed description of the task. */
    @Column(name = "description", length = 500)
    private String description;

    @Column(name = "start_date", nullable = false, updatable = true)
    private LocalDateTime startDate;

    @Column(name = "end_date", nullable = false, updatable = true)
    private LocalDateTime endDate;

    /** The date/time when the task was created (immutable). */
    @Column(name = "created_date", nullable = false, updatable = false)
    private LocalDateTime createdDate;

    /** The due date/time by which the task should be completed (optional). */
    @Column(name = "due_date")
    private LocalDateTime dueDate;

    /** Current status of the task (e.g., NEW, IN_PROGRESS, COMPLETED). */
    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false, length = 20)
    private TaskStatus status;

    /** Priority level of the task (e.g., LOW, MEDIUM, HIGH). */
    @Enumerated(EnumType.STRING)
    @Column(name = "priority", nullable = false, length = 20)
    private TaskPriority priority;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "assigned_group_id", nullable = false)
    private GroupBase assignedGroup;

    /** The user to whom this task is assigned. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "assigned_to_user_id", referencedColumnName = "id")
    private User assignedToUser;

   /** The job this task belongs to (mandatory). */
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "job_id", referencedColumnName = "id", nullable = false)
    private Job job;

    /** The date/time when the task was actually completed (optional). */
    @Column(name = "completed_date")
    private LocalDateTime completedDate;

    /** Flag indicating if the task is recurring. Default: false. */
    @Column(name = "is_recurring", nullable = false)
    private boolean isRecurring = false;

    /** Recurring interval (DAILY, WEEKLY, MONTHLY, etc.), if applicable. */
    @Enumerated(EnumType.STRING)
    @Column(name = "recurring_interval")
    private RecurringInterval recurringInterval;

        public Task(String title, String description, LocalDateTime startDate, LocalDateTime endDate) {
        this.title = title;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    /**
     * Automatically sets the createdDate when the entity is first persisted.
     */
    @PrePersist
    protected void onCreate() {
        this.createdDate = LocalDateTime.now();
    }
}