package com.example.securityexamplejwt.model;

import java.util.List;

import static com.example.securityexamplejwt.model.ApplicationUserPermission.*;

public enum ApplicationUserRole {
    STUDENT(List.of(STUDENT_READ,STUDENT_WRITE,COURSE_READ)),
    ADMIN(List.of(STUDENT_READ,STUDENT_WRITE,COURSE_READ,COURSE_WRITE)),
    ADMIN_TRAINEE(List.of(STUDENT_READ,COURSE_READ));

    private List<ApplicationUserPermission> applicationUserPermissions;

    ApplicationUserRole(List<ApplicationUserPermission> applicationUserPermissions){
        this.applicationUserPermissions = applicationUserPermissions;
    }

    public List<ApplicationUserPermission> getApplicationUserPermissions() {
        return applicationUserPermissions;
    }
}
