package kr.devmon.events;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.hateoas.Links;

@Controller
public class EventController {
	@PostMapping("/api/events")
	public ResponseEntity createEvent() {
		linkTo
	}

}
