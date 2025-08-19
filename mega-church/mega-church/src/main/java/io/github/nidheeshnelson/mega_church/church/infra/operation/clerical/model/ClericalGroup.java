package io.github.nidheeshnelson.mega_church.church.infra.operation.clerical.model;

import io.github.nidheeshnelson.mega_church.common.model.GroupBase;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("CLERICAL")
public class ClericalGroup extends GroupBase {
    
}
