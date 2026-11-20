package com.Online_exam_management_system.repositoryTests;


import com.Online_exam_management_system.model.Users.User;
import com.Online_exam_management_system.model.Users.embded.Address;
import com.Online_exam_management_system.model.enums.Role;
import com.Online_exam_management_system.model.enums.Status;
import com.Online_exam_management_system.repository.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@Component
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void userSaveTest(){
        User user = new User("username","password","amirSatari","0912",
                new Address("Tehran","Mehrabad","12121"), Role.ADMIN, Status.Pending);

        User user1 = userRepository.save(user);

        assertEquals(1,user1.getId());
    }


}
