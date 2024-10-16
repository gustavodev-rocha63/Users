package com.example.Users.Users;

import com.example.Users.Entity.Participants;
import com.example.Users.Entity.ParticipantsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.stream.Collectors;
import com.example.Users.Entity.ParticipantsRepository;
import java.util.List;

@RestController
@RequestMapping("/users")

public class UsersController {
    @Autowired
    private ParticipantsRepository participantsRepository;

    @GetMapping("/list")
    public List<Participants>Users(){
        return participantsRepository.findAll();
    }
}
