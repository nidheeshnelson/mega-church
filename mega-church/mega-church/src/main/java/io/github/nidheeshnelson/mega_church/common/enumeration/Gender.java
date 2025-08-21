package io.github.nidheeshnelson.mega_church.common.enumeration;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Biological sex or self-identified gender")
public enum Gender {
    MALE, 
    FEMALE, 
    OTHER, 
    UNSPECIFIED
}