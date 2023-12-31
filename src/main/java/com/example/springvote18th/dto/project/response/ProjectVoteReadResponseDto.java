package com.example.springvote18th.dto.project.response;

import com.example.springvote18th.entity.Project;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ProjectVoteReadResponseDto {
    private Long id;
    private String name;
    private String description;
    private int count;

    public static ProjectVoteReadResponseDto from(Project project) {
        return ProjectVoteReadResponseDto.builder()
                .id(project.getId())
                .name(project.getName())
                .description(project.getDescription())
                .count(project.getCount())
                .build();
    }
}
