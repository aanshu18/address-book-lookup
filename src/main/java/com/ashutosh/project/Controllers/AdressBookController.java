package com.ashutosh.project.Controllers;

import com.ashutosh.project.Entity.Users;
import com.ashutosh.project.Service.AddressBookServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdressBookController {


    private AddressBookServiceInterface addressBookServiceInterface;

    @Autowired
    public AdressBookController( AddressBookServiceInterface addressBookServiceInterface)
    {
        this.addressBookServiceInterface = addressBookServiceInterface;
    }

    @GetMapping("/search")
    public List<Users> searchAddressBook(@RequestParam("searchString") String searchString){
        return addressBookServiceInterface.searchAddresses(searchString);
    }

}
