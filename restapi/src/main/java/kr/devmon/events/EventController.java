package kr.devmon.events;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EventController {
	@PostMapping("/api/events")
	public ResponseEntity createEvent() {
		URI createdUri = linkTo(methodOn(EventController.class).createEvent()).slash("{id}").toUri();
		return ResponseEntity.created(createdUri).build();
	}

}
