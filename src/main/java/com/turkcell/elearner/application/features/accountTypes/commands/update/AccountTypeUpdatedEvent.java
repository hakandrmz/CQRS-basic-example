package com.turkcell.elearner.application.features.accountTypes.commands.update;

import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
public class AccountTypeUpdatedEvent {

    @TargetAggregateIdentifier
    private String accountTypeId;
    private String accountName;
    private double price;
    private String description;
}
