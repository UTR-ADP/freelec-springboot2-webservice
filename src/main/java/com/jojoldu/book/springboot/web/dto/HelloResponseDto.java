package com.jojoldu.book.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter                     //선언된 모든 필드의 get 메소드 생성
@RequiredArgsConstructor    // final 필드 -> 생성자 생성
public class HelloResponseDto
{
    private final String name;
    private final int amount;
}
