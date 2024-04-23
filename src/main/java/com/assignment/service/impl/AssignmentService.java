package com.assignment.service.impl;

import com.assignment.entity.Assignment;
import com.assignment.service.IAssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssignmentService implements IAssignmentService {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Assignment> getAllAssignments() {
        List<Assignment> assignmentList = mongoTemplate.findAll(Assignment.class, "assignment");
        return assignmentList;
    }
}
