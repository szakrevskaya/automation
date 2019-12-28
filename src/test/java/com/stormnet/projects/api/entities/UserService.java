package com.stormnet.projects.api.entities;

import by.stormnet.core.FrameworkHttpClient;
import by.stormnet.core.Response;

public class UserService extends AbstractService {
    private FrameworkHttpClient client = new FrameworkHttpClient();
    private String userUrl = baseAppUrl + "/com/stormnet/projects/api/users";

    public Response getUsersList(){
        System.out.println("Get users list request");
        return client.doGet(userUrl);
    }

    public Response createNewUser(String userData){
        System.out.println("Create new user with data " + userData);
        return client.doPost(userUrl, userData);
    }

}
