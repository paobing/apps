package com.paobing.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DataSizeUnit;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.util.unit.DataSize;
import org.springframework.util.unit.DataUnit;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

@Data
@ConfigurationProperties(prefix = "env")
public class ServerConfig {
    private String name;

    /**
     * 通过DurationUnit改变计量单位
     */
    @DurationUnit(ChronoUnit.DAYS)
    private Duration timeout;

    /**
     * 通过DataSizeUnit改变存储单位
     * 也可以在配置文件中直接书写
     */
    @DataSizeUnit(DataUnit.MEGABYTES)
    private DataSize dataSize;
}
