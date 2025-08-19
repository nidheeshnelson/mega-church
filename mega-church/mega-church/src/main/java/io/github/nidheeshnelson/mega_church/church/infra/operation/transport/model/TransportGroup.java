package io.github.nidheeshnelson.mega_church.church.infra.operation.transport.model;

import io.github.nidheeshnelson.mega_church.common.model.GroupBase;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("TRANSPORT")
public class TransportGroup extends GroupBase {
    
}
