package com.msg.baseBoot.repository;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "Config")
@Table(name = "Config")
public class Config {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Config_Id")
    private long configId;

    @Column(name = "Config_Key")
    private String configKey;

    @Column(name = "Config_Value")
    private String configValue;

    @Column(name = "Description")
    private String description;
}
