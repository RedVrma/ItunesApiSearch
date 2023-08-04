package com.lybratepuneetverma.models;

import java.util.ArrayList;

public class ResponseModel {

    public int resultCount;
    public ArrayList<Track> results;

    public ResponseModel(int resultCount, ArrayList<Track> results) {
        this.resultCount = resultCount;
        this.results = results;
    }

    @Override
    public String toString() {
        return "ResposeModel{" +
                "resultCount=" + resultCount +
                ", results=" + results +
                '}';
    }
}
