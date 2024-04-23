package com.assignment.controller;

import com.assignment.entity.Assignment;
import com.assignment.service.IAssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class AssignmentController {

    @Autowired
    private IAssignmentService assignmentService;

    @GetMapping("/assignment")
    public ResponseEntity<List<Assignment>> getAssignmentList() {
        List<Assignment> assignmentList = assignmentService.getAllAssignments();
        return new ResponseEntity<>(assignmentList, HttpStatus.OK);
    }
}
