package io.github.nidheeshnelson.mega_church.church.infra.support.hospitality.model;

import io.github.nidheeshnelson.mega_church.common.model.GroupBase;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("HOSPITALITY")
public class HospitalityGroup extends GroupBase {
    
}
