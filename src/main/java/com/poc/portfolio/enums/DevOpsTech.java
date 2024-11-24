package com.poc.portfolio.enums;

import lombok.Getter;

@Getter
public enum DevOpsTech {
  SELENIUM("Selenium", ExperienceLevel.INTERMEDIATE.name()), DATA_ANALYSIS("Data Analysis", ExperienceLevel.INTERMEDIATE
          .name());

  private final String technology;
  private final String experienceLevel;

  DevOpsTech(String technology, String experienceLevel) {
    this.technology = technology;
    this.experienceLevel = experienceLevel;
  }

}
