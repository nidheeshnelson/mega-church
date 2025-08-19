package io.github.nidheeshnelson.mega_church.church.infra.support.pastor.model;

import io.github.nidheeshnelson.mega_church.common.model.GroupBase;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("PASTOR")
public class PastorGroup extends GroupBase {
    
}
