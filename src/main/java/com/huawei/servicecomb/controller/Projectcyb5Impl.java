package com.huawei.servicecomb.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2020-02-14T22:36:32.099Z")

@RestSchema(schemaId = "projectcyb5")
@RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON)
public class Projectcyb5Impl {

    @Autowired
    private Projectcyb5Delegate userProjectcyb5Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProjectcyb5Delegate.helloworld(name);
    }

}
