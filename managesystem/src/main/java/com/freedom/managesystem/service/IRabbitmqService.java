package com.freedom.managesystem.service;


import org.jetbrains.annotations.NotNull;

public interface IRabbitmqService {

    @NotNull
    public String overview();

    @NotNull
    public String nodelistOfcluster();

}
