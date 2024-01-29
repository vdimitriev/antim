package mk.dmt.antim.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/hello")
class HelloController {
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun hello():ResponseEntity<String> {
        return ResponseEntity("Hello from AntIM", HttpStatus.OK)
    }
}