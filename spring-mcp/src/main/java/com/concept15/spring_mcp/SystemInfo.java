package com.concept15.spring_mcp;

import java.util.LinkedHashMap;
import java.util.Map;

public class SystemInfo {
    public String directoryPath;
    public boolean directoryExists;
    public boolean directoryIsDirectory;
    public long directoryFreeSpaceBytes;
    public long directoryUsableSpaceBytes;
    public long directoryTotalSpaceBytes;

    public String osName;
    public String osVersion;
    public String osArch;

    public String javaVersion;
    public String javaVendor;
    public String javaHome;

    public String userName;
    public String userHome;
    public String userDir;

    public long memoryMax;
    public long memoryTotal;
    public long memoryFree;

    public int availableProcessors;
    public double systemLoadAverage;

    public Map<String, String> installedSoftware = new LinkedHashMap<>();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OS: ").append(osName).append(" ").append(osVersion).append(" (").append(osArch).append(")\n");
        sb.append("Java: ").append(javaVersion).append(" - ").append(javaVendor).append("\n");
        sb.append("User: ").append(userName).append(" (").append(userHome).append(")\n");
        sb.append("Directory: ").append(directoryPath).append(" exists=").append(directoryExists).append("\n");
        sb.append("Memory: Max=").append(memoryMax).append(" Total=").append(memoryTotal).append(" Free=").append(memoryFree).append("\n");
        sb.append("Processors: ").append(availableProcessors).append(" Load Avg=").append(systemLoadAverage).append("\n");
        sb.append("Installed Software:\n");
        installedSoftware.forEach((k, v) -> sb.append("  ").append(k).append(": ").append(v).append("\n"));
        return sb.toString();
    }
}
