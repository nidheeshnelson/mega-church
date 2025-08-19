package io.github.nidheeshnelson.mega_church.church.infra.physical.campus.model;

import io.github.nidheeshnelson.mega_church.common.model.GroupBase;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("CAMPUS")
public class CampusWorkingGroup extends GroupBase {
    
}
