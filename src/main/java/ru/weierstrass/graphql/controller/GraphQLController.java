package ru.weierstrass.graphql.controller;

import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
public class GraphQLController implements ErrorController {

    @Autowired
    private GraphQL graphQL;

    @RequestMapping( value = "*", method = { RequestMethod.GET, RequestMethod.POST } )
    @ResponseBody
    public String graphQL( @RequestParam String query ) {
        return graphQL.execute( query ).getData().toString();
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }

    @RequestMapping( path = "/error" )
    @ResponseBody
    public String error( HttpServletResponse response ) {
        return "Ошибка";
    }

}
