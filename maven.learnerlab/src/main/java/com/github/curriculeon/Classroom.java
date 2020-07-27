package com.github.curriculeon;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by leon on 7/27/2020.
 */
public enum Classroom {
    INSTANCE;
    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();


    public void hostLecture(Teacher teacher, Double numberOfHours) {
        teacher.lecture((Learner[])students.toArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours) {
        Person person = instructors.findById(id);
        Instructor instructor = (Instructor)person;
        instructor.lecture((Learner[])students.toArray(), numberOfHours);
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> result = new HashMap<>();
        for(Person studentAsPerson : students.toArray()) {
            Student student = (Student)studentAsPerson;
            Double studyTime = student.getTotalStudyTime();
            result.put(student, studyTime);
        }
        return result;
    }
}
