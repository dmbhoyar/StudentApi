package com.studentapi.studentapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentapi.studentapi.entity.Students;
import com.studentapi.studentapi.repository.UserRepository;

@Service
public class StudentService {
    @Autowired
    private UserRepository userrepo;

    public List<Students> getAllStudent() {
        List<Students> allStudent = new ArrayList<>();
        Iterable<Students> iterable = userrepo.findAll();
        iterable.forEach(allStudent::add);
        return allStudent;
    }

    public void addStudent(Students students) {
        userrepo.save(students);
    }

    public void updateStudents(long id, Students updatedStudent) {
        // Find the existing student by ID
        userrepo.findById(id).ifPresent(existingStudent -> {
           
            existingStudent.setName(updatedStudent.getName());
            existingStudent.setDegreeName(updatedStudent.getDegreeName());
            existingStudent.setDegreeType(updatedStudent.getDegreeType());
            existingStudent.setMobNo(updatedStudent.getMobNo());
            existingStudent.setEmailId(updatedStudent.getEmailId());

            
            userrepo.save(existingStudent);
        });
    }

    public void deleteStudent(long id) {
        userrepo.deleteById(id);
    }
}
