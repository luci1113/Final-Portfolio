package com.poc.portfolio.enums;

import lombok.Getter;

@Getter
public enum BackendTech {
  JAVA("JAVA 8", ExperienceLevel.INTERMEDIATE.name()), SPRING("Spring",
      ExperienceLevel.INTERMEDIATE.name()),SPRING_BOOT("Spring Boot",
          ExperienceLevel.INTERMEDIATE.name()), PYTHON("Python", ExperienceLevel.BEGINNER.name());

  private final String technology;
  private final String experienceLevel;

  BackendTech(String technology, String experienceLevel) {
    this.technology = technology;
    this.experienceLevel = experienceLevel;
  }

}
