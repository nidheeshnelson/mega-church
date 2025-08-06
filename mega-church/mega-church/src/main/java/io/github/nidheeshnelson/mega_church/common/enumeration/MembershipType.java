package io.github.nidheeshnelson.mega_church.common.enumeration;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Types of church membership")
public enum MembershipType {

    @Schema(description = "Regular member who attends and participates actively")
    REGULAR,

    @Schema(description = "Honorary member recognized for their contributions or service")
    HONORARY,

    @Schema(description = "Associate member who may not have full rights or participation")
    ASSOCIATE,

    @Schema(description = "Temporary member enrolled for a short period or specific program")
    TEMPORARY,

    @Schema(description = "Visiting member from another church or denomination")
    VISITOR,

}
