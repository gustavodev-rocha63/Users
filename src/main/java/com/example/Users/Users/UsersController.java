package com.example.Users.Users;

import com.example.Users.Entity.Participants;
import com.example.Users.Entity.ParticipantsRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/participants")

public class UsersController {
    @GetMapping("/list")
    public List<Participants> test(){
        return ParticipantsRepository.findAll();
    }
}
