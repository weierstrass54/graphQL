package ru.weierstrass.graphql.config;

import com.coxautodev.graphql.tools.SchemaParser;
import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.weierstrass.graphql.Query;

@Configuration
@EnableAutoConfiguration
public class GraphQLConfig {

    @Autowired
    private Query query;

    @Bean
    public GraphQL getGraphQL() {
        GraphQLSchema schema = SchemaParser.newParser().file( "schema.graphqls" ).resolvers( query ).build().makeExecutableSchema();
        return GraphQL.newGraphQL( schema ).build();
    }

}
