package com.careerdevs.streamingservicefactory;

public class StreamingService {
    public String name;
    public Integer yearEstablished;
    public Boolean freeOption;

    public StreamingService(String name, Integer yearEstablished, Boolean freeOption) {
        this.name = name;
        this.yearEstablished = yearEstablished;
        this.freeOption = freeOption;
    }

    @Override
    public String toString() {
        return "StreamingService{" +
                "name='" + name + '\'' +
                ", yearEstablished=" + yearEstablished +
                ", freeOption=" + freeOption +
                '}';
    }
}
