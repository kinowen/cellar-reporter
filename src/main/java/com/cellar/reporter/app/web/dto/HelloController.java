package com.cellar.reporter.app.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class HelloController {

    private final String name;
    private final Integer count;
}
