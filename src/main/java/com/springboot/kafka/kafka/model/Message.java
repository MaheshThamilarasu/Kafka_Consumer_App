package com.springboot.kafka.kafka.model;

public class Message {
    private String topicName;
    private String message;
    private String topicId;

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    @Override
    public String toString() {
        return "Message{" +
                "topicName='" + topicName + '\'' +
                ", message='" + message + '\'' +
                ", topicId='" + topicId + '\'' +
                '}';
    }
}
