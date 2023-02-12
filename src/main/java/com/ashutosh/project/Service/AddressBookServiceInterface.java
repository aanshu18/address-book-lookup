package com.ashutosh.project.Service;

import com.ashutosh.project.Entity.Users;

import java.util.List;

public interface AddressBookServiceInterface {

    public List<Users> searchAddresses(String searchString);
}
