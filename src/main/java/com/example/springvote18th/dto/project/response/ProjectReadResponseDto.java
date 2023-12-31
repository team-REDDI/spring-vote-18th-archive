package com.example.springvote18th.dto.project.response;

import com.example.springvote18th.entity.Project;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ProjectReadResponseDto {
    private Long id;
    private String name;
    private String description;

    public static ProjectReadResponseDto from(Project project) {
        return ProjectReadResponseDto.builder()
                .id(project.getId())
                .name(project.getName())
                .description(project.getDescription())
                .build();
    }
}
