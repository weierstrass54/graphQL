package ru.weierstrass.graphql.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Link {

    private final String url;
    private final String description;

}
