package org.asr.experiments.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SayingDto {
    private long id;
    private String content;

    public SayingDto() {
        // Jackson deserialization
    }

    public SayingDto(long id, String content) {
        this.id = id;
        this.content = content;
    }

    @JsonProperty
    public long getId() {
        return id;
    }

    @JsonProperty
    public String getContent() {
        return content;
    }
}
