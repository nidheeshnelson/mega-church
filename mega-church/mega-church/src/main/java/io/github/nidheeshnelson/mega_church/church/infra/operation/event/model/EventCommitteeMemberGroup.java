package io.github.nidheeshnelson.mega_church.church.infra.operation.event.model;

import io.github.nidheeshnelson.mega_church.common.model.GroupBase;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("EVENT_COMMITTEE_MEMBER")
public class EventCommitteeMemberGroup extends GroupBase{
    
}
