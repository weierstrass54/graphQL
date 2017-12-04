package ru.weierstrass.graphql.repository;

import org.springframework.stereotype.Repository;
import ru.weierstrass.graphql.model.Link;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LinkRepository {

    private final List<Link> links;

    public LinkRepository() {
        links = new ArrayList<Link>() {{
            add( new Link( "http://howtographql.com", "Your favorite GraphQL page" ) );
            add( new Link( "http://graphql.org/learn/", "The official docks" ) );
        }};
    }

    public List<Link> getAllLinks() {
        return links;
    }

    public void saveLink( Link link ) {
        links.add( link );
    }

}
