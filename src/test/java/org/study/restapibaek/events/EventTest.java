package org.study.restapibaek.events;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EventTest {

    @Test
    void builderTest() {
        Event event = Event.builder().build();
        assertThat(event).isNotNull();
    }

    @Test
    void javabean() {
        // Given
        String name = "Event";
        String description = "Spring";

        // When
        Event event = new Event();
        event.setName(name);
        event.setDescription(description);

        // Then
        assertThat(event.getName()).isEqualTo(name);
        assertThat(event.getDescription()).isEqualTo(description);
    }

}