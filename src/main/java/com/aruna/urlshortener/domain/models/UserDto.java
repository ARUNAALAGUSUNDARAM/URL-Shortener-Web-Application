package com.aruna.urlshortener.domain.models;

import com.aruna.urlshortener.domain.entities.User;

import java.io.Serializable;

/**
 * DTO for {@link User}
 */
public record UserDto(Long id, String name) implements Serializable {
}