package kr.devmon.events;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

class EventTest {

	@Test
	void builder() {
		Event event = Event.builder()
				.name("fehead's STring REST API")
				.description("Rest API development with String")
				.build();
		assertThat(event).isNotNull();

	}

	@Test
	void javaBean() {
		Event event = new Event();
		String name = "fehead's STring REST API";
		String description = "Rest API development with String";
		event.setName(name);
		event.setDescription(description);

		assertThat(event.getName()).isEqualTo(name);
		assertThat(event.getDescription()).isEqualTo(description);
	}

}
