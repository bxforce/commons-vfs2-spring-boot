package com.bxforce.commons.vfs2.autoconfigure;

import org.apache.commons.vfs2.FileSystemException;
import org.apache.commons.vfs2.FileSystemManager;
import org.apache.commons.vfs2.FileSystemOptions;
import org.apache.commons.vfs2.VFS;
import org.apache.commons.vfs2.provider.sftp.SftpFileSystemConfigBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableConfigurationProperties(VFSProperties.class)
@Configuration
public class VFSAutoConfiguration {
    @Autowired
    private VFSProperties properties;

    @Bean
    public FileSystemManager manager() throws FileSystemException {
        FileSystemManager manager = VFS.getManager();

        return VFS.getManager();
    }

    @Bean
    FileSystemOptions options() throws FileSystemException {
        FileSystemOptions options = new FileSystemOptions();

        if (null != properties.getSftp()) {
            SftpFileSystemProperties sftpProperties = properties.getSftp();
            SftpFileSystemConfigBuilder builder = SftpFileSystemConfigBuilder.getInstance();

            if (null != sftpProperties.getPreferredAuthentications()) {
                builder.setPreferredAuthentications(options, sftpProperties.getPreferredAuthentications());
            }

            if (null != sftpProperties.getCompression()) {
                builder.setCompression(options, sftpProperties.getCompression());
            }

            if (null != sftpProperties.getTimeout()) {
                builder.setConnectTimeoutMillis(options, sftpProperties.getTimeout());
            }

            if (null != sftpProperties.getFileNameEncoding()) {
                builder.setFileNameEncoding(options, sftpProperties.getFileNameEncoding());
            }

            if (null != sftpProperties.getKeyExchangeAlgorithm()) {
                builder.setKeyExchangeAlgorithm(options, sftpProperties.getKeyExchangeAlgorithm());
            }

            if (null != sftpProperties.getKnownHosts()) {
                builder.setKnownHosts(options, sftpProperties.getKnownHosts());
            }

            if (null != sftpProperties.getLoadOpenSSHConfig()) {
                builder.setLoadOpenSSHConfig(options, sftpProperties.getLoadOpenSSHConfig());
            }

            if (null != sftpProperties.getSessionTimeoutMillis()) {
                builder.setSessionTimeoutMillis(options, sftpProperties.getSessionTimeoutMillis());
            }

            if (null != sftpProperties.getStrictHostKeyChecking()) {
                builder.setStrictHostKeyChecking(options, sftpProperties.getStrictHostKeyChecking());
            }

            if (null != sftpProperties.getUserDirIsRoot()) {
                builder.setUserDirIsRoot(options, sftpProperties.getUserDirIsRoot());
            }

            if (null != sftpProperties.getDisableDetectExecChannel()) {
                builder.setDisableDetectExecChannel(options, sftpProperties.getDisableDetectExecChannel());
            }
        }

        return options;
    }
}