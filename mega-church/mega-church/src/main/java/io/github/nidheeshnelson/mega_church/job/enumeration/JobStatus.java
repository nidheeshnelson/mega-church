package io.github.nidheeshnelson.mega_church.job.enumeration;

/**
 * Enumeration of possible statuses for a {@link Job}.
 *
 * <p>A job typically progresses through the following lifecycle states:
 * <ul>
 *   <li>{@link #OPEN} – The job is created but not yet started.</li>
 *   <li>{@link #IN_PROGRESS} – Work has begun; tasks may be assigned and executed.</li>
 *   <li>{@link #COMPLETED} – All tasks are finished and the job is closed.</li>
 *   <li>{@link #CANCELLED} – The job was terminated before completion.</li>
 * </ul>
 *
 * <p>Additional statuses can be added as business requirements evolve.</p>
 *
 * @author Nidheesh_Nelson
 */
public enum JobStatus {

    /** Job is created but not yet started. */
    OPEN,

    /** Job execution is in progress. */
    IN_PROGRESS,

    /** Job has been successfully completed. */
    COMPLETED,

    /** Job was cancelled before completion. */
    CANCELLED
}

