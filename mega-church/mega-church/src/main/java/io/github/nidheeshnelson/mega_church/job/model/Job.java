package io.github.nidheeshnelson.mega_church.job.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import io.github.nidheeshnelson.mega_church.common.model.GroupBase;
import io.github.nidheeshnelson.mega_church.job.enumeration.JobStatus;
import jakarta.persistence.CascadeType;
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
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Represents a Job in the system.
 *
 * <p>A Job is a higher-level work container that can be divided into
 * multiple {@link Task}s. Each task can then be assigned to different
 * users for execution. A job typically has a title, description,
 * status, and scheduling metadata (start/end dates).</p>
 *
 * <p><b>Relationships</b>:
 * <ul>
 *   <li>{@code Job → Task}: One-to-many. A Job may contain many Tasks.</li>
 *   <li>{@code Task → User}: Each Task is assigned to a single User.</li>
 * </ul>
 *
 * <p><b>Lifecycle</b>:
 * Jobs are created with a title, description, and optional start/end dates.
 * Their status progresses through states such as OPEN, IN_PROGRESS, COMPLETED.</p>
 *
 * @author
 *   Nidheesh Nelson
 */
@Entity
@Table(name = "jobs")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Job {

    /** Unique identifier for the Job (primary key). */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** Short title or name of the job. */
    @Column(nullable = false, length = 100)
    private String title;

    /** Detailed description of the job. */
    @Column(length = 500)
    private String description;

    /** Current status of the job (e.g., OPEN, IN_PROGRESS, COMPLETED, CANCELLED). */
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private JobStatus status = JobStatus.OPEN;

    /** Planned start date/time of the job. */
    private LocalDateTime startDate;

    /** Planned end date/time of the job. */
    private LocalDateTime endDate;

    /** Audit: when the job was created. */
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    /** Audit: last updated timestamp. */
    private LocalDateTime updatedAt;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "assigned_group_id", nullable = false)
    private GroupBase assignedGroup;

    /** Tasks associated with this job. */
    @OneToMany(mappedBy = "job", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Task> tasks = new ArrayList<>();

    // --- Getters and Setters omitted for brevity ---
}