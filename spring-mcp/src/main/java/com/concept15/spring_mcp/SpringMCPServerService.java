package com.concept15.spring_mcp;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

import java.io.*;
import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.util.*;

@Service
public class SpringMCPServerService {
    private static final Logger log = LoggerFactory.getLogger(SpringMCPServerService.class);

    @Tool(name = "get_system_information", description = "Gathers detailed system-level diagnostics including directory info, OS and architecture details, JVM configuration, memory stats, CPU load, and installed software versions.")
    public static SystemInfo getSystemInfo() {
        SystemInfo info = new SystemInfo();

        Properties props = System.getProperties();
        info.osName = props.getProperty("os.name");
        info.osVersion = props.getProperty("os.version");
        info.osArch = props.getProperty("os.arch");
        info.javaVersion = props.getProperty("java.version");
        info.javaVendor = props.getProperty("java.vendor");
        info.javaHome = props.getProperty("java.home");
        info.userName = props.getProperty("user.name");
        info.userHome = props.getProperty("user.home");
        info.userDir = props.getProperty("user.dir");

        Runtime runtime = Runtime.getRuntime();
        info.memoryMax = runtime.maxMemory();
        info.memoryTotal = runtime.totalMemory();
        info.memoryFree = runtime.freeMemory();

        OperatingSystemMXBean osBean = ManagementFactory.getOperatingSystemMXBean();
        info.availableProcessors = osBean.getAvailableProcessors();
        info.systemLoadAverage = osBean.getSystemLoadAverage();

        return info;
        }



    /*public static void writeStackTraceToFile() {
        String stackTrace = Arrays.toString(Thread.currentThread().getStackTrace())
                .replace(",", "\n");

        try (FileWriter writer = new FileWriter("/Users/jagnyapanigrahi/Documents/MCP/stacktrace.log", true)) {
            writer.write("----- Stack Trace -----\n");
            writer.write(stackTrace);
            writer.write("\n------------------------\n");
        } catch (IOException e) {
            e.printStackTrace(); // Or log this instead
        }
    }*/
    }




