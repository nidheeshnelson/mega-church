package io.github.nidheeshnelson.mega_church.church.infra.support.volunteer.model;

import io.github.nidheeshnelson.mega_church.common.model.GroupBase;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("VOLUNTEER")
public class VolunteerGroup extends GroupBase {
    
}
