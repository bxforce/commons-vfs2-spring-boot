package com.bxforce.commons.vfs2.autoconfigure;

import java.io.File;

public class SftpFileSystemProperties {
    private String preferredAuthentications;
    private String compression;
    private Integer timeout;
    private String fileNameEncoding;
    private String keyExchangeAlgorithm;
    private File knownHosts;
    private Boolean loadOpenSSHConfig;
    private Integer sessionTimeoutMillis;
    private String strictHostKeyChecking;
    private Boolean userDirIsRoot;
    private Boolean disableDetectExecChannel;

    public String getPreferredAuthentications() {
        return preferredAuthentications;
    }

    public void setPreferredAuthentications(String preferredAuthentications) {
        this.preferredAuthentications = preferredAuthentications;
    }

    public String getCompression() {
        return compression;
    }

    public void setCompression(String compression) {
        this.compression = compression;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public String getFileNameEncoding() {
        return fileNameEncoding;
    }

    public void setFileNameEncoding(String fileNameEncoding) {
        this.fileNameEncoding = fileNameEncoding;
    }

    public String getKeyExchangeAlgorithm() {
        return keyExchangeAlgorithm;
    }

    public void setKeyExchangeAlgorithm(String keyExchangeAlgorithm) {
        this.keyExchangeAlgorithm = keyExchangeAlgorithm;
    }

    public File getKnownHosts() {
        return knownHosts;
    }

    public void setKnownHosts(File knownHosts) {
        this.knownHosts = knownHosts;
    }

    public Boolean getLoadOpenSSHConfig() {
        return loadOpenSSHConfig;
    }

    public void setLoadOpenSSHConfig(Boolean loadOpenSSHConfig) {
        this.loadOpenSSHConfig = loadOpenSSHConfig;
    }

    public Integer getSessionTimeoutMillis() {
        return sessionTimeoutMillis;
    }

    public void setSessionTimeoutMillis(Integer sessionTimeoutMillis) {
        this.sessionTimeoutMillis = sessionTimeoutMillis;
    }

    public String getStrictHostKeyChecking() {
        return strictHostKeyChecking;
    }

    public void setStrictHostKeyChecking(String strictHostKeyChecking) {
        this.strictHostKeyChecking = strictHostKeyChecking;
    }

    public Boolean getUserDirIsRoot() {
        return userDirIsRoot;
    }

    public void setUserDirIsRoot(Boolean userDirIsRoot) {
        this.userDirIsRoot = userDirIsRoot;
    }

    public Boolean getDisableDetectExecChannel() {
        return disableDetectExecChannel;
    }

    public void setDisableDetectExecChannel(Boolean disableDetectExecChannel) {
        this.disableDetectExecChannel = disableDetectExecChannel;
    }
}
