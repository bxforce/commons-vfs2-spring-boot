# Apache Commons Virtual File System Spring Boot Starter

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.bxforce/commons-vfs2-spring-boot/badge.svg?style=flat-square)](https://maven-badges.herokuapp.com/maven-central/com.github.bxforce/hyperledger-fabric-spring-boot)
[![javadoc](https://javadoc.io/badge2/com.github.bxforce/commons-vfs2-spring-boot/javadoc.svg)](https://javadoc.io/doc/com.github.bxforce/commons-vfs2-spring-boot)

Apache Commons Virtual File System Spring Boot Starter provides an easy way to get your Spring boot application using Apache Commons Virtual File System up and running quickly.

To use the Apache Commons Virtual File System Spring Boot Starter in your projects you can include the maven dependency in your project pom file:

```xml
<dependency>
    <groupId>com.github.bxforce</groupId>
    <artifactId>commons-vfs2-spring-boot-starter</artifactId>
    <version>1.0.1-RELEASE</version>
</dependency>
```

## Usage

First add the configuration in your application.yml. There is a lot of parameters, you can check the file SftpFileSystemProperties and the doc of vfs2 (https://commons.apache.org/proper/commons-vfs/api.html) if you need something particular.

```yaml
commons-vfs2:
    sftp:
        preferredAuthentications: password
```

In your code, you autowire FileSystemManager and the options FileSystemOptions

```java
@Autowired
private FileSystemManager manager;

@Autowired
private FileSystemOptions options;
```

And you can then connect to the sftp with the manager. 
`ftpURI` is the url to your ftp, ie sftp://username:password@domain.com/path/to/file

```java
FileObject remote = manager.resolveFile(ftpURI, options);
```