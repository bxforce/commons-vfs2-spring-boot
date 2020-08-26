package com.bxforce.commons.vfs2.autoconfigure;

import org.apache.commons.vfs2.*;
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
    FileSystemOptions options() {
        FileSystemOptions options = new FileSystemOptions();

        if (null != properties.getSftp()) {
            SftpFileSystemConfigBuilder instance = SftpFileSystemConfigBuilder.getInstance();

            instance.setPreferredAuthentications(options, properties.getSftp().getPreferredAuthentications());
        }

        return options;
    }
}