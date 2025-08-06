package io.github.nidheeshnelson.mega_church.common.enumeration;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Status of a member within the church")
public enum MemberStatus {

    @Schema(description = "Member is currently active and participating in church activities")
    ACTIVE,

    @Schema(description = "Member is currently not participating but not removed")
    INACTIVE,

    @Schema(description = "Membership is temporarily suspended")
    SUSPENDED,

    @Schema(description = "Member is deceased")
    DECEASED,

    @Schema(description = "Member has transferred to another church or congregation")
    TRANSFERRED,

    @Schema(description = "Membership is awaiting administrative approval")
    PENDING_APPROVAL
}
