package ru.weierstrass.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.weierstrass.graphql.model.Link;
import ru.weierstrass.graphql.repository.LinkRepository;

import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {

    @Autowired
    private LinkRepository repository;

    public List<Link> allLinks() {
        return repository.getAllLinks();
    }

}
