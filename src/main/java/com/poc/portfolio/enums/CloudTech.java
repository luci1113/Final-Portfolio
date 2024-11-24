package com.poc.portfolio.enums;

import lombok.Getter;

@Getter
public enum CloudTech {
  INTELLIJ_IDEA("IntelliJ_Idea", ExperienceLevel.INTERMEDIATE.name()), POSTMAN("Postman", ExperienceLevel.BEGINNER.name()), POWER_BI("Power BI",
      ExperienceLevel.INTERMEDIATE.name()), STS("Spring Tool",
      ExperienceLevel.INTERMEDIATE.name()), VISUAL_CODE("Visual Code",
      ExperienceLevel.INTERMEDIATE.name());

  private final String technology;
  private final String experienceLevel;

  CloudTech(String technology, String experienceLevel) {
    this.technology = technology;
    this.experienceLevel = experienceLevel;
  }

}
