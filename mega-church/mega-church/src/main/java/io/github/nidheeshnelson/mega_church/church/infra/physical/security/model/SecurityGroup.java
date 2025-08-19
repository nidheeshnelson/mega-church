package io.github.nidheeshnelson.mega_church.church.infra.physical.security.model;

import io.github.nidheeshnelson.mega_church.common.model.GroupBase;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("SECURITY")
public class SecurityGroup extends GroupBase {
    
}
