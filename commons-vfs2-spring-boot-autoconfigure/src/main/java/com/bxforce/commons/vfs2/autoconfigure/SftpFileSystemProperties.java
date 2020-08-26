package com.bxforce.commons.vfs2.autoconfigure;

import org.apache.commons.vfs2.provider.sftp.SftpFileSystemConfigBuilder;

import java.io.File;

public class SftpFileSystemProperties {
    private String preferredAuthentications;
    private String compression;
    private Integer timeout;
    private String fileNameEncoding;
    private IdentityProviderProperties[] identityProvider;
    private String keyExchangeAlgorithm;
    private File knownHosts;
    private Boolean loadOpenSSHConfig;
    private String proxyCommand;
    private String proxyHost;
    private String proxyPassword;
    private Integer proxyPort;
    private SftpFileSystemConfigBuilder.ProxyType proxyType;
    private String proxyUser;
    private Integer sessionTimeoutMillis;
    private String strictHostKeyChecking;
    private Boolean userDirIsRoot;

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

    public Integer getSessionTimeoutMillis() {
        return sessionTimeoutMillis;
    }

    public void setSessionTimeoutMillis(Integer sessionTimeoutMillis) {
        this.sessionTimeoutMillis = sessionTimeoutMillis;
    }

    public String getProxyUser() {
        return proxyUser;
    }

    public void setProxyUser(String proxyUser) {
        this.proxyUser = proxyUser;
    }

    public String getProxyHost() {
        return proxyHost;
    }

    public void setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
    }

    public String getProxyPassword() {
        return proxyPassword;
    }

    public void setProxyPassword(String proxyPassword) {
        this.proxyPassword = proxyPassword;
    }

    public Integer getProxyPort() {
        return proxyPort;
    }

    public void setProxyPort(Integer proxyPort) {
        this.proxyPort = proxyPort;
    }

    public SftpFileSystemConfigBuilder.ProxyType getProxyType() {
        return proxyType;
    }

    public void setProxyType(SftpFileSystemConfigBuilder.ProxyType proxyType) {
        this.proxyType = proxyType;
    }

    public String getProxyCommand() {
        return proxyCommand;
    }

    public void setProxyCommand(String proxyCommand) {
        this.proxyCommand = proxyCommand;
    }

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

    public IdentityProviderProperties[] getIdentityProvider() {
        return identityProvider;
    }

    public void setIdentityProvider(IdentityProviderProperties[] identityProvider) {
        this.identityProvider = identityProvider;
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
}
