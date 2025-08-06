package io.github.nidheeshnelson.mega_church.common.enumeration;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Church-specific functional roles")
public enum ChurchRole {

    @Schema(description = "Senior Pastor overseeing the entire church")
    SENIOR_PASTOR,

    @Schema(description = "Regional Pastor overseeing multiple areas or regions")
    REGIONAL_PASTOR,

    @Schema(description = "Area Pastor overseeing specific zones/areas")
    AREA_PASTOR,

    @Schema(description = "Ordained pastor overseeing spiritual activities")
    PASTOR,

    @Schema(description = "Worship leader coordinating the worship team")
    WORSHIP_LEADER,

    @Schema(description = "Worship team member or choir participant")
    WORSHIP_TEAM,

    @Schema(description = "Person who plays instruments during worship")
    INSTRUMENT_PLAYER,

    @Schema(description = "Person responsible for church security and safety")
    SECURITY,

    @Schema(description = "Treasurer responsible for handling church finances")
    TREASURER,

    @Schema(description = "Member of the Sunday school teaching team")
    SUNDAY_SCHOOL_TEACHER,

    @Schema(description = "Volunteer helping in church services or events")
    VOLUNTEER,

    @Schema(description = "Area leader managing a specific geographic region of church members")
    AREA_LEADER,

    @Schema(description = "Leader of a care cell/small group")
    CARE_CELL_LEADER,

    @Schema(description = "Media team member handling visual and projection content")
    MEDIA_TEAM,

    @Schema(description = "Team responsible for sound equipment and audio setup")
    SOUND_SYSTEM_TEAM,

    @Schema(description = "Team handling camera work and live streaming")
    CAMERA_WORKS,

    @Schema(description = "Team managing vehicle parking during services or events")
    VEHICLE_PARKING,

    @Schema(description = "Regular church member without any assigned responsibilities")
    MEMBER
}

