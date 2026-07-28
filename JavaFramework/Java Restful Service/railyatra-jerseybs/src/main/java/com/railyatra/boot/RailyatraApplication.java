package com.railyatra.boot;

import com.google.common.collect.ImmutableSet;
import com.railyatra.resources.ticket.TicketResource;
import com.railyatra.resources.train.RailEnquiryResource;
import jakarta.ws.rs.core.Application;

import java.util.Set;

public class RailyatraApplication extends Application {
    private Set<Object> singletons;
    private Set<Class<?>> classes;

    public RailyatraApplication() {
        this.singletons = ImmutableSet.of(new RailEnquiryResource());
        this.classes = ImmutableSet.of(TicketResource.class);
    }

    @Override
    public Set<Class<?>> getClasses() {
        return classes;
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}
