package io.github.nidheeshnelson.mega_church.church.infra.physical.custodial.model;

import io.github.nidheeshnelson.mega_church.common.model.GroupBase;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("CUSTODIAL")
public class CustodialGroup extends GroupBase {
    
}
