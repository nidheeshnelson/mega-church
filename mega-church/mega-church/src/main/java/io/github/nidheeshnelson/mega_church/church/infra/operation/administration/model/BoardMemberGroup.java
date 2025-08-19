package io.github.nidheeshnelson.mega_church.church.infra.operation.administration.model;

import io.github.nidheeshnelson.mega_church.common.model.GroupBase;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("BOARD_MEMBER")
public class BoardMemberGroup extends GroupBase {
    
}
