package org.example.scheduler.abstractions;


import java.time.LocalDateTime;

@FunctionalInterface
public interface IProvideNextExecutionTime {
    LocalDateTime provideNextExecutionTime();



}
