package com.example.Users.Users;

import com.example.Users.Entity.Participants;
import com.example.Users.Entity.ParticipantsRepository;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")

public class UsersController {
    @Autowired
    private ParticipantsRepository participantsRepository;

    @GetMapping("list")
    public List<Participants>Users(){
        return participantsRepository.findAll();
    }

    @PostMapping("/server")
    public Participants Request(@Valid @RequestBody Participants participants){
        return participantsRepository.save(participants );
    }
}
