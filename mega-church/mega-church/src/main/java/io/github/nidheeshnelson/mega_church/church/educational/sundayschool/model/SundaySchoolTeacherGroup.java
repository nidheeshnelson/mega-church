package io.github.nidheeshnelson.mega_church.church.educational.sundayschool.model;

import io.github.nidheeshnelson.mega_church.common.model.GroupBase;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("SUNDAY_SCHOOL_TEACHER")
public class SundaySchoolTeacherGroup extends GroupBase {
    
}
