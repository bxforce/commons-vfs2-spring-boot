package com.bxforce.commons.vfs2.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("commons-vfs2")
public class VFSProperties {
    private SftpFileSystemProperties sftp;

    public SftpFileSystemProperties getSftp() {
        return sftp;
    }

    public void setSftp(SftpFileSystemProperties sftp) {
        this.sftp = sftp;
    }
}
