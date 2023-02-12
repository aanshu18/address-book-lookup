package com.ashutosh.project.Service;

import com.ashutosh.project.Entity.Users;
import org.springframework.stereotype.Service;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements AddressBookServiceInterface {

    public List<Users> searchAddresses(String searchString){
        String line = "";
        String splitBy = ",";
        List<Users> resultList = new ArrayList<>();
        try
        {

            InputStream is = AddressBookService.class.getResourceAsStream("/convertcsv.csv");
            InputStreamReader streamReader = new InputStreamReader(is, StandardCharsets.UTF_8);
            BufferedReader reader = new BufferedReader(streamReader);
            while ((line = reader.readLine()) != null)
            {
                if(line.contains(searchString)) {
                    String[] users = line.split(splitBy);    // use comma as separator
                    resultList.add(new Users(users[0], Integer.parseInt(users[1]), users[2], users[3], users[4]));
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return resultList;
    }
}
