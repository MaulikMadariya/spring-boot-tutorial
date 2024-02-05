package com.example.demo.service;

import javax.management.relation.Role;

public interface RoleService {
    Role findByName(String name);
}
